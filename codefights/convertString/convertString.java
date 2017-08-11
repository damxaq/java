boolean convertString(String s, String t) {
    int i=0;
    String r = new String();
    if (t.length()>s.length()) return false;
    for(int j=0; j<t.length();j++)
        for(;i<s.length();i++)
            if (t.charAt(j)==s.charAt(i)){
                r+=t.charAt(j);
                break;
            }
 
    return r.equals(t);
}

