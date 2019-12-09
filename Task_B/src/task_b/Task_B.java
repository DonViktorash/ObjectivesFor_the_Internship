/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_b;
import java.util.ArrayList;
/**
 *
 * @author asus
 */
public class Task_B {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world");
        ArrayList<String> lphone = new ArrayList<>(); //Телефонные номера
        ArrayList<String> ltemplate = new ArrayList<>(); //Шаблоны полные
        ArrayList<String> clearTemplate = new ArrayList<>();//Только номера шаблонов
        //Создание экземпляров классов
        insertList il = new insertList();
        insertTemplates it = new insertTemplates();
        clearTemplates ct = new clearTemplates();
        //Создание работы
        lphone = il.phones(lphone,2);
        System.out.println("List in main::"+lphone);
        ltemplate = it.templates(ltemplate, 2);
        System.out.println("Template in main::"+ltemplate);
        clearTemplate = ct.list(ltemplate, clearTemplate);
        System.out.println("ClearTemplate in main::"+clearTemplate);
        //getResult.java
        //Кидаем в конструктор сразу две очереди
        // телефоны + обработанные шаблоны
        // Здесь ищем сходства
        compareTwoLists ctl = new compareTwoLists(lphone,clearTemplate,ltemplate);
        ctl.comparator();
    }
    
}
//System.out.println();