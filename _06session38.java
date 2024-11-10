//                                  SESSION-38
/*DETERMINE IF A STRING HAS ALL UNIQUE CHARACTERS
given a string , determine the string if it has all unique characters
i/p= abcd10jk o/p true
i/p= hutg9mnd!nk9 o/p=false */
// class Test
// {
//  static boolean UniqueString(String s){
//     char[] ch=s.toCharArray();
//     int l=ch.length;
//     for(int i=0;i<l;i++){
//         for(int j=i+1;j<l;j++){
//             if(ch[i]==ch[j]){
//                 return false;
//             }
//         }
//     }
//     return true;
// }    
// public static void main(String[] args) {
//     String s="abcd10jk";
//     System.out.println(UniqueString(s));
//     String s1="hutg9mnd!nk9";
//     System.out.println(UniqueString(s1));
// }
// }

// BY HASHEST
// import java.util.HashSet;
// class Test1
// {
//  static boolean UniqueString(String s){
//     HashSet<Character> hs=new HashSet<Character>();
//     for(int i=0;i<s.length();i++)
//          hs.add(s.charAt(i));
//     return hs.size()==s.length();
// }    
// public static void main(String[] args) {
//     String s="abcd10jk";
//     System.out.println(UniqueString(s));
//     String s1="hutg9mnd!nk9";
//     System.out.println(UniqueString(s1));
// }
// }
