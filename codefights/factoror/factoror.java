int[] factoror(int[] n) {

    int d=n.length;
    int[] res = new int[d];
    int temp,f;
    
    for (int i=0; i<d; i++){
        res[i]++;
        temp=n[i];
        f=fac(n[i]);
        while(temp!=f){
            temp=f;
            f=fac(temp);
            System.out.print(" || ");
            res[i]++;
        }
        System.out.println();
    }

    return res;
}

int fac (int l){
    int t=0;
    for (int i=2;i<l;i++){
        while(l%i==0){
            System.out.print(l+" / " + i + " = "+l/i+ "; ");
            t+=i;
            l/=i;
            if(i==l) break;
        }
    }
    t+=l;
    return t;
}

