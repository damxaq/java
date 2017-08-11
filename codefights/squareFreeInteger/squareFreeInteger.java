boolean squareFreeInteger(int num) {

    int t;
    int k=0;
    for (int i=2; i<num; i++){
        t=num;
        k=0;
        while (t%i==0){
            t/=i;
            k++;
        }
        if(k>1) return false;
    }

    return true;
}
