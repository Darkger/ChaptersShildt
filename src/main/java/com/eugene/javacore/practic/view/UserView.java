package com.eugene.javacore.practic.view;

import com.eugene.javacore.practic.controller.PostController;
import com.eugene.javacore.practic.controller.RegionController;
import com.eugene.javacore.practic.controller.UserController;
import com.eugene.javacore.practic.model.Post;
import com.eugene.javacore.practic.model.Region;
import com.eugene.javacore.practic.model.User;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UserView {
    UserController userController = new UserController();
    PostController postController = new PostController();
    RegionController regionController = new RegionController();
    public void viewDeleteById(String str) throws IOException {

         userController.deleteById(str);
        System.out.println("Пользователь с id=" + str + " удален из файла");
    }

    public void viewSave(User user) throws IOException {

        user = userController.save(user);
        if (user != null)
            System.out.println("Регино " + "'" + user.getFirstName()+" "+ user.getLasName() + " '" + " сохранен с id=" + user.getId());
        else System.out.println("Ошбика:Регион не может быть сохранен!");
    }

    public void viewGetAll() throws IOException {

        List<User> userList = userController.getAll();
        if (userList.isEmpty())
            System.out.println("Файл пуст");
        else {
            System.out.println("Список регионов:");
            if (userList != null){
            for (User user: userList) {
                String str = "";
 List<Post> gg = user.getPosts();
                    for (Post p : gg) {

                            str += p.getId() + ",";
                        }
                        str = str.substring(0, str.length() - 1);
                        System.out.println(user.getId() + "," + user.getFirstName() + "," + user.getLasName() + "," + "[" + str + "]" + "," + user.getRegion().getId());
                    }
            }else System.out.println("Список пуст");
        }
    }

    public void viewUpdate(User user) throws IOException {

        User user1 = userController.Update(user);
        if (user1 != null)
            System.out.println("Идентификатор id=" + user.getId() + " теперь присвоен пользователю '" + user.getFirstName()+" "+user.getLasName() + "'");
        else System.out.println("Ошибка:Пользователь не может быть изменен");
    }

    public void viewGetUserById(String str) throws IOException {

        User user = userController.getUserById(str);
        if (user != null)
            System.out.println("Идентификатор id=" + user.getId() + "принадлежит пользователю'" + user.getFirstName()+" "+user.getLasName() + "'");
        else System.out.println("Регион не найден!");
    }

    public Boolean routing() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("РАБОТА С ФАЙЛОМ  'user.txt':\n\n");
        System.out.println("Доступный список действий:\n ");
        System.out.println("1. Введите команду -'LIST'   чтобы получить список пользователей");
        System.out.println("2. Введите команду -'BYID'   чтобы получить пользователя по id ");
        System.out.println("3. Введите команду -'SAVE'   чтобы сохранить пользователя");
        System.out.println("4. Введите команду -'UPDATE' чтобы изменить пользователя");
        System.out.println("5. Введите команду -'DELETE' чтобы удалить  пользователя");
        String str = reader.readLine();
        switch (str) {
            case "LIST": {
                viewGetAll();
                break;
            }
            case "BYID": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                viewGetUserById(id);
                break;

            }
            case "SAVE": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                System.out.println("Введите имя пользователя: ");
                String userFirstName = reader.readLine();
                System.out.println("Введите фамилию пользователя: ");
                String userLastName = reader.readLine();
                System.out.println("Введите id постов пользователя через запятую: ");
                String userPostId = reader.readLine();
                System.out.println("Введите  регион пользователя: ");
                String userRegion = reader.readLine();
                List<Post> postList = new ArrayList<>();
                String postArray [] = userPostId.split(",");
                for(String str1:postArray)
                {
                    postList.add(postController.getPostById(str1));
                }
                User user = new User(id, userFirstName,userLastName,postList,regionController.save(new Region(userRegion)));
                viewSave(user);
                break;
            }
            case "UPDATE": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                System.out.println("Введите имя пользователя: ");
                String userFirstName = reader.readLine();
                System.out.println("Введите фамилию пользователя: ");
                String userLastName = reader.readLine();
                System.out.println("Введите id постов пользователя через запятую: ");
                String userPostId = reader.readLine();
                System.out.println("Введите  регион пользователя: ");
                String userRegion = reader.readLine();
                List<Post> postList = new ArrayList<>();
                String postArray [] = userPostId.split(",");
                for(String str1:postArray)
                {
                    postList.add(postController.getPostById(str1));
                }
                User user = new User(id, userFirstName,userLastName,postList,regionController.save(new Region(userRegion)));
                viewUpdate(user);
                break;
            }
            case "DELETE": {
                System.out.println("Введите id1: ");
                String id = reader.readLine();
                viewDeleteById(id);
                break;
            }
        }
        System.out.println("Продолжить работу? Y/N :");
        str = reader.readLine();
        if (str.equals("N"))
            return false;
        else return true;
    }
}
