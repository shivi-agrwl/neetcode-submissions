class Solution {

    public String encode(List<String> strs) {
        String encode="";
        for(String str : strs){
encode = encode+str.length()+"#"+str;
        }
        System.out.println(encode);
return encode;
    }

    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int j = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1 + length;
            res.add(s.substring(j + 1, i));
        }
        return res;
    }
}
