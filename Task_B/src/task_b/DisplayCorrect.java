package task_b;

class Display{
    void someMeth(char[] Templ,char[] clPhone){
        System.out.println("In display");
        
        for(int i=0,j=0; i<Templ.length; ){
            /*
            if(Templ[i+1]!= '-'){
               break;
            }
            *///48 - 57
            if(Templ[i] != 'X'){
               // System.out.println("i1");
                if(Templ[i] < 48 || Templ[i] > 57){
                    System.out.print(Templ[i]);
                    i++;
                }
            } 
            if(Templ[i] != 'X'){
               // System.out.println("i2");
                if(Templ[i] >= 48 || Templ[i] <= 57){
                        System.out.print(Templ[i]);
                        i++;
                        j++;
                }
            }
            if(Templ[i] == 'X'){
               // System.out.println("i3");
                if(clPhone[j] >= 48 && clPhone[j] <= 57){
                    System.out.print(clPhone[j]);
                    j++;
                }
            }
        }
        /*
        int count=0;
        for(int i=0; i<Templ.length; i++){
           if(Templ[i]!= '-'){
               count++;
               break;
           }
        }
        for(int i=count; i<Templ.length; i++){
          // System.out.print(Templ[i]);
        }
       // System.out.println();
       */
    }
}