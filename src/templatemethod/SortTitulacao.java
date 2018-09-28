package templatemethod;

public class SortTitulacao extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        int comp = a.getTitulacao().compareTo(b.getTitulacao());
        return comp < 0;
    }
    
}
