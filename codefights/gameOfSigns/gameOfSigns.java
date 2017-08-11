public char b;
public int x,y;

boolean gameOfSigns(String[] m, String d) {
    
    int s=m.length, z=m[0].length(), i=0, j;
    
    b=d.charAt(0);
    for (; i<s; i++)
        for (j=0; j<z; j++){
            if (m[i].charAt(j)=='S') {
                x=j;
                y=i;
            }
        }
    
    while(m[y].charAt(x)!='F'  && y>=0 ){
        b=k(m[y].charAt(x),b);
        x=b=='R'?x+1:b=='L'?x-1:x;
        y=b=='U'?y-1:b=='D'?y+1:y;
        if (x>=z || x<0 || y>=s || y<0)  break;
        if (m[y].charAt(x)=='F') return true;
    }
    return false;
}


char k(char m, char d){
    return (d=='U' && m=='L') || (d=='D' && m=='R')?'L':(d=='U' && m=='R') || (d=='D' && m=='L')?'R':(d=='L' && m=='L') || (d=='R' && m=='R')?'D':(d=='L' && m=='R') || (d=='R' && m=='L')?'U':d;
}


