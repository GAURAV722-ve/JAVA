public class String_compression {

    public int compress(char[] chars) {

        int n=chars.length;
        int idx=0;

        for(int i=0; i<n;){
            int count=0;
            char ch=chars[i];
            while(i<n && ch==chars[i]){
                count++;
                i++;
            }
            if(count==1){
                chars[idx++]=ch;
            }else{
                chars[idx++]=ch;
                String str = String.valueOf(count);
                for(char dig:str.toCharArray()){
                    chars[idx++]=dig;
                }
            }
        }

        return idx;
    }

    public static void main(String[] args) {

        String_compression obj = new String_compression();

        char[] chars = {'a', 'a', 'a', 'b', 'c', 'c'};

        int len = obj.compress(chars);

        System.out.println("Length: " + len);

        for(int i=0; i<len; i++){
            System.out.print(chars[i]+" ");
        }
    }
}