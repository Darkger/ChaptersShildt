package com.eugene.javacore.practic.VIEWS;


import com.eugene.javacore.practic.CONTROLLERS.PostController;
import com.eugene.javacore.practic.ESSENCES.Post;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class PostView {
    PostController regionController = new PostController();

    public void viewDeleteById(String str) throws IOException {

        regionController.deleteById(str);
        System.out.println("Пост с id=" + str + " удален из файла");
    }

    public void viewSave(Post post) throws IOException {

        post = regionController.save(post);
        if (post != null)
            System.out.println("Пост" + "'" + post.getContent() + "'" + " сохранен с id=" + post.getId());
        else System.out.println("Ошбика:Пост не может быть сохранен!");
    }

    public void viewGetAll() throws IOException {

        List<Post> regionList = regionController.getAll();
        if (regionList==null)
            System.out.println("Файл пуст");
        else {
            System.out.println("Список постов:");
            for (Post region : regionList) {
                System.out.println(region.getId() + "," + region.getContent());
            }
        }
    }

    public void viewUpdate(Post post) throws IOException {

        Post post1 = regionController.Update(post);
        if (post1 != null)
            System.out.println("Идентификатор id=" + post.getId() + " теперь присвоен посту '" + post.getContent() + "'");
        else System.out.println("Ошибка:Пост не может быть изменен");
    }

    public void viewGetRegionById(String str) throws IOException {

        Post post = regionController.getRegionById(str);
        if (post != null)
            System.out.println("Идентификатор id=" + post.getId() + "принадлежит посту '" + post.getContent());
        else System.out.println("Пост не найден!");
    }

    public Boolean routing() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("РАБОТА С ФАЙЛОМ  'post.txt':\n\n");
        System.out.println("Доступный список действий:\n ");
        System.out.println("1. Введите команду -'LIST'   чтобы получить список всех постов");
        System.out.println("2. Введите команду -'BYID'   чтобы получить пост по id ");
        System.out.println("3. Введите команду -'SAVE'   чтобы сохранить пост");
        System.out.println("4. Введите команду -'UPDATE' чтобы изменить пост");
        System.out.println("5. Введите команду -'DELETE' чтобы удалить  пост");
        String str = reader.readLine();
        switch (str) {
            case "LIST": {
                viewGetAll();
                break;
            }
            case "BYID": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                try {
                    Double.parseDouble(id);

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели некорректный ID,повторите попытку");
                    break;
                }
                viewGetRegionById(id);
                break;

            }
            case "SAVE": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                try {
                    Double.parseDouble(id);

                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели некорректный ID,повторите попытку");
                    break;
                }
                System.out.println("Введите Пост: ");
                String regionName = reader.readLine();
                Post post = new Post(id, regionName);
                viewSave(post);
                break;
            }
            case "UPDATE": {
                System.out.println("Введите id: ");
                String id = reader.readLine();
                System.out.println("Введите пост: ");
                String regionName = reader.readLine();
                Post post = new Post(id, regionName);
                viewUpdate(post);
                break;
            }
            case "DELETE": {
                System.out.println("Введите id: ");
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

