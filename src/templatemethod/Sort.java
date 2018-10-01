package templatemethod;

import java.util.List;

public abstract class Sort {
    
    public List<Professor> insertSort(List<Professor> dados){
        for(int i = 0;i < dados.size(); i++){
            Professor aux = dados.get(i);
            int j = i;
            while((j > 0) && (compare(dados.get(j-1),aux))){
                dados.set(j, dados.get(j-1));
                j -= 1;
            }
            dados.set(j, aux);
        }
        return dados;
    }
    
    public List<Professor> insertSortD(List<Professor> dados){
        for(int i = 0;i < dados.size(); i++){
            Professor aux = dados.get(i);
            int j = i;
            while((j > 0) && (!compare(dados.get(j-1),aux))){
                dados.set(j, dados.get(j-1));
                j -= 1;
            }
            dados.set(j, aux);
        }
        return dados;
    }
    
    public abstract boolean compare(Professor a, Professor b);
}
