package task_b;
import java.util.ArrayList;
import java.util.Scanner;

class insertList{
    private String setNum;
    Scanner in = new Scanner(System.in);
    ArrayList<String> phones (ArrayList<String>phone,int count){
        for(int i=0; i<count; i++){
            setNum = in.nextLine(); //set номер телефона
            setNum = correction(setNum);
            phone.add(setNum);
        }
        return phone;
    }
    String correction(String setNum){
        char[] ch;
        int count = 0;
        ch = setNum.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]>= 48 && ch[i] <= 57){
                count++;
            }
        }
        char[] ch2 = new char[count];
        for(int i=0,j=0;i<ch.length;i++){
            if(ch[i]>= 48 && ch[i] <= 57){
                ch2[j] = ch[i];
                j++;
            }
        }
        String returner = new String(ch2);
        return returner;
    }
}

class insertTemplates{
    private String setTempl;
    Scanner in = new Scanner(System.in);
    ArrayList<String> templates (ArrayList<String>template,int count){
        for(int i=0; i<count; i++){
            setTempl = in.nextLine();
            template.add(setTempl);
        }
        return template;
    }
}

class clearTemplates{
   private comparator comp = new comparator();
    ArrayList<String> list(ArrayList<String> ltemplate,ArrayList<String> clearTemplate){
       String set;
       for(int i=0;i<2;i++){
           set = comp.clearToNew(ltemplate.get(i));
           clearTemplate.add(set);
       }
       return clearTemplate; 
    }
}
class comparator{
   private char[] ch;
   private char[] ch2;
   private int count = 0;
    String clearToNew(String template){
        ch = template.toCharArray();
        count = 0;
        for(int i=0;i<ch.length;i++){
            if((ch[i]>=48 && ch[i] <= 57) || ch[i] == 'X'){
                count++;
            }
        }
        ch2 = new char[count];
        for(int i=0,j=0; i<ch.length; i++){
            if((ch[i]>=48 && ch[i] <= 57) || ch[i] == 'X'){
                ch2[j] = ch[i];
                j++;
            }
        }
        String str = new String(ch2);
        return str;
    }
}