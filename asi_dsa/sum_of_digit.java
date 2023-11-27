class sum_of_digit{
    public static void main(String[] args){
        int num=1234;
        String s=String.valueOf(num);
        int sum=0;
        for(int i=s.length(); i>=0; i--){
            sum +=s.charAt(i);
            
        }
        System.out.println(sum);

        
    }

    
    

}