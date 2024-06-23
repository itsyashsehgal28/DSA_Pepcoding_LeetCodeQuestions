// video 105

import java.util.*;

public class DuplicateBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                if(st.peek()=='('){
                    System.out.println("true");
                    return;
                }
                else{
                    while(st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }else{
                st.push(ch);
            }
            sc.close();
        }
        System.out.println("false");
        
    }
}
