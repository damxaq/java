String incrementCipher(String s, int[] n) {
    int i=0,j;
    char[] t=s.toCharArray();
    for (;i<n.length; i++)
        for(j=0; j<s.length(); j++)
            if ((j+1)%n[i]==0) 
                if (t[j]+1>122) t[j]=97;
                else t[j]++;
            
    return String.valueOf(t);
}

