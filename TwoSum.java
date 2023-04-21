package myproject.provaon;
public class TwoSum {
    private int[] entrada;
    private int target;
    
    public TwoSum(int[] numbers, int target){
        this.entrada = numbers;
        this.target = target;
    }
    public void calcular(){
        int[] saida =  new int[2];
        int inp = 0;
        int qtd = 0;
        int aux=1;
        while(entrada[qtd]+entrada[aux]!=this.target){
            aux++;
            if(aux==entrada.length){
               qtd++;
               aux=qtd+1;
            }
        }
        saida[inp++]=qtd;
        saida[inp]=aux;
        for(int i = 0;i<saida.length;i++){
            System.out.print(saida[i]+" ");
    }
    }
}