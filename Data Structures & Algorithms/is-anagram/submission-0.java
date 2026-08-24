class Solution {
    public boolean isAnagram(String s, String t) {
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
Map<String,Integer> ms=new HashMap<>();
Map<String,Integer> mt=new HashMap<>();
for(char cs : strS){
if(ms.containsKey(Character.toString(cs))){
    ms.put(Character.toString(cs),ms.get(Character.toString(cs))+1);
}
else
{
    ms.put(Character.toString(cs),1);
}
}
for(char ct : strT){
if(mt.containsKey(Character.toString(ct))){
    mt.put(Character.toString(ct),mt.get(Character.toString(ct))+1);
}
else
{
    mt.put(Character.toString(ct),1);
}
}
if(ms.equals(mt))
{return true;}
return false;
    }
}
