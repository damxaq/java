boolean schedulable(int[][] t) {
    
    float l=0;
    int i=0, s = t.length;
    for (; i<s; i++) l+=1.0*t[i][0]/t[i][1];                          
    return l<=s*(Math.pow(2,1.0/s)-1);
}

