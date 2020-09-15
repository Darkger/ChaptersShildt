package com.eugene.javacore.practic.repository.repositoryIO;

import com.eugene.javacore.practic.model.Post;
import com.eugene.javacore.practic.model.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements com.eugene.javacore.practic.repository.UserRepository {
    private Path userFile = Paths.get("C:\\javaFiles\\user.txt");
    private PostRepositoryImpl postRepository = new PostRepositoryImpl();
    private RegionRepositoryImpl regionRepository = new RegionRepositoryImpl();
    @Override
    public User getById(Long id) {
        try{
            List<String> listRegFile = Files.readAllLines(userFile);
            List<Post> listPost = new ArrayList<>();
            if (!listRegFile.isEmpty()) {
                for (String str : listRegFile) {
                    String str2 [] = str.split("[\\[\\]]");
                    String str4 [] = str2[0].substring(0,str2[0].length()-1).split(",");
                    String strReg=str2[2].substring(1,str2[2].length());
                    String strArray [] = new String[]{str4[0],str4[1],str4[2],str2[1],strReg};

                    if (strArray[0].equals(String.valueOf(id))) {
                              String strArrayPosts[] = strArray[3].split(",");
                              for (String str3:strArrayPosts)
                              {listPost.add(postRepository.getById(Long.parseLong(str3)));

                              }
                        return new User(String.valueOf(id), strArray[1],strArray[2],listPost,regionRepository.getById(Long.parseLong(strArray[4])));
                    }
                }
            }
            //System.out.println("id не найден");
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public List<User> getAll() {
        try{
            List<String> listRegFile = Files.readAllLines(userFile);
            List<User> listUserObj = new ArrayList<>();

            if (!listRegFile.isEmpty()) {
                for (String str : listRegFile) {
                    String str2 [] = str.split("[\\[\\]]");
                    String str4 [] = str2[0].substring(0,str2[0].length()-1).split(",");
                    String strReg=str2[2].substring(1);
                    String strArray [] = new String[]{str4[0],str4[1],str4[2],str2[1],strReg};


                    String strArrayPosts[] = strArray[3].split(",");
                    List<Post> listPost = new ArrayList<>();
                    for (String str3:strArrayPosts)
                    {listPost.add(postRepository.getById(Long.parseLong(str3)));

                    }
                    listUserObj.add(new User(strArray[0], strArray[1],strArray[2],listPost,regionRepository.getById(Long.parseLong(strArray[4]))));

                }
                return listUserObj;
            }
            //System.out.println("Файл не содержит данных");
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public User save(User user) {
        int flag = 0;
        try{
            if(!Files.exists(userFile)){
                Files.createFile(userFile);
            }
            List<String> listReg = Files.readAllLines(userFile);

              IOUtils.listIdAndMaxVal(listReg);
            int maxValue = IOUtils.getMaxValue();
            List<String>  listId=IOUtils.getListId();

            switch (user.getId()) {
                case "": {
                    for (String str : listReg) {
                        if (str.contains(user.getFirstName()) & str.contains(user.getLasName())) {
                            String strArray[] = str.split(",",2);
                            user.setId(strArray[0]);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag != 1) {
                        user.setId(String.valueOf(++maxValue));
                    }
                }
                default:
                    for (String str : listReg) {
                        if (str.contains(user.getFirstName()) & str.contains(user.getLasName())) {
                            String strArray[] = str.split(",");
                            user.setId(strArray[0]);
                            flag = 1;
                            break;
                        }
                        if (flag != 1) {
                            if (listId.contains(user.getId()))
                                user.setId(String.valueOf(++maxValue));
                        }
                    }
            }
            if (flag != 1) {
                String postId="[";
                try {
                    for(Post p:user.getPosts())
                    {
                        postId+=p.getId()+",";
                    }
                    postId=postId.substring(0,postId.length()-1);
                    postId+="]";
                    Files.writeString(userFile, user.getId() + "," + user.getFirstName() + ","+ user.getLasName()+ ","+postId+ ","+user.getRegion().getId()+"\n", StandardOpenOption.APPEND);
                    // System.out.println("В файл записаны: id = " + region.getId() + " Регион = " + region.getCharRegName());

                } catch (IOException e) {
                    System.out.println("ошибка записи в файл3");
                }
            }
            return user;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public User update(User user) {
        try {
            List<String> listRegFile = Files.readAllLines(userFile);
            List<String> listId = new ArrayList<>();
            List<String> listUserNotId = new ArrayList<>();

            String postId="";
                for(Post p:user.getPosts())
                {
                    postId+=p.getId()+",";
                }
                postId=postId.substring(0,postId.length()-1);

            String userNotId=user.getFirstName()+","+user.getLasName()+","+"["+postId+"]"+","+user.getRegion().getId();

            if (!listRegFile.isEmpty()) {
                for (String str : listRegFile) {
                    String str2 [] = str.split("[\\[\\]]");
                    String str4 [] = str2[0].substring(0,str2[0].length()-1).split(",");
                    String strReg=str2[2].substring(1);
                    String strArray [] = new String[]{str4[0],str4[1],str4[2],str2[1],strReg};
                     listId.add(strArray[0]);
                    listUserNotId.add(strArray[1]+","+strArray[2]+","+"["+strArray[3]+"]"+","+strArray[4]);
                }
                if (listId.contains(user.getId())) {

                    listUserNotId.set(listId.indexOf(user.getId()),userNotId);
                    Files.delete(userFile);
                    Files.createFile(userFile);
                    for (int i = 0; i < listId.size(); i++) {
                        try {
                            Files.writeString(userFile, listId.get(i) + "," + listUserNotId.get(i) + "\n", StandardOpenOption.APPEND);

                        } catch (IOException e) {
                            System.out.println("ошибка записи в файл3");
                        }
                    }
                }
                return user;
            }
            System.out.println("файл пуст");
            return null;
        } catch (IOException e) {
            System.out.println(e);
            return null;
        }
    }

    @Override
    public void deleteById(Long id) {
        try{
            List<String> listReg = Files.readAllLines(userFile);
            ArrayList<Long> listId = new ArrayList<>();
            for (String str : listReg) {
                String strArray[] = str.split(",",5);
                listId.add(Long.parseLong(strArray[0]));
            }
            if (listId.contains(id)) {
                listReg.remove(listId.indexOf(id));
                Files.delete(userFile);
                Files.createFile(userFile);
                for (String str : listReg) {
                    try {


                        Files.writeString(userFile, str + "\n", StandardOpenOption.APPEND);

                    } catch (IOException e) {
                        System.out.println("ошибка записи в файл3");
                    }
                }
            } else {
                System.out.println("id не найден");
            }
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
