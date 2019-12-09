package task_b;
import java.util.ArrayList;
class compareTwoLists{
    ArrayList<String> lphone = new ArrayList<>();
    ArrayList<String> clearTemplate = new ArrayList<>();
    ArrayList<String> Template = new ArrayList<>();
    Display display = new Display();
    boolean flag;
    compareTwoLists(ArrayList<String>lphone,ArrayList<String>clearTemplate,ArrayList<String>ltemplate){
        this.lphone = lphone;
        this.clearTemplate = clearTemplate;
        this.Template = ltemplate;
        flag = false;
    }
    void comparator(){
        for(int i=0;i < clearTemplate.size();i++){
            String str1 = clearTemplate.get(i);
            //String str1 = new String(clearTemplate.get(i));
            char[] clTempl = str1.toCharArray(); //Массив шаблона
            String str2 = null;
            char[] Templ = null;
            str2 = Template.get(i);
            // String str2 = new String(Template.get(i));
            Templ = str2.toCharArray(); //Массив шаблона
            for(int j=0;j < lphone.size();j++){
                String str3 = lphone.get(j);
                //String str3 = new String(lphone.get(j));
                char[] clPhone = str3.toCharArray(); //массив телефона
                //System.out.println("Result of compare:"+checkTruth(ch,cch));
                flag = checkTruth(clTempl,clPhone);
                if(flag){
                    try{
                    display.someMeth(Templ,clPhone);
                    }catch(ArrayIndexOutOfBoundsException obj){
                        System.out.println(obj);
                    }
                }
            }
        }
    }
    
    boolean checkTruth(char[] temp, char[] num){
        for(int i=0; i<temp.length;i++){
            //System.out.print(temp[i]);
        }
        System.out.println();
        for(int i=0; i<num.length;i++){
            //System.out.print(num[i]);
        }
        System.out.println();
            if(temp.length == num.length){
            for(int i=0; i<temp.length;i++){
                if(temp[i]==num[i]){
                }else if(temp[i] == 'X'){
                    return true;
                }else if(temp[i]!=num[i]){
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
/*
+7(929)9323716
+7(917)5718617
+7(929)9XXXXXX
+7(917)5XXXXXX
*/
/*
1. - Разбив на чар массив, мы сможем сразу вычислить сходство по длинне
2. - При true в п. 1, мы сможем сделать посимвольное сравнение до Х-элемента
3. - При Удовлетворительном результате, мы можем записать для каждого телефонного
//номера в специальный массив номер шаблона, по котором потом сделать
//в готовый шаблон нельзя вставить, потому что может быть еще будут номера
// который должны встать в шаблон
*/