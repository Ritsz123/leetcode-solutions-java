class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i >= 0 && j >= 0){
            int num = carry + Integer.parseInt(Character.toString(num1.charAt(i))) + Integer.parseInt(Character.toString(num2.charAt(j)));
            carry = num / 10;
            if(num > 9){
                num = num % 10;
            }
            
            sb.append(num);
            i--;
            j--;
        }
        
        while(i >= 0) {
            int num;
            if(carry > 0) {
                num = carry + Integer.parseInt(Character.toString(num1.charAt(i)));
                
                carry = num / 10;
                if(num > 9) {    
                    num = num % 10;
                }
            }else{
                num = Integer.parseInt(Character.toString(num1.charAt(i)));
            }
            sb.append(num);
            i--;
        }
        while(j >= 0){
            int num;
            if(carry > 0) {
                num = carry + Integer.parseInt(Character.toString(num2.charAt(j)));
                
                carry = num / 10;
                if(num > 9) {    
                    num = num % 10;
                }
            }else{
                num = Integer.parseInt(Character.toString(num2.charAt(j)));
            }
            sb.append(num);
            j--;
        }
        
        if(carry > 0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}