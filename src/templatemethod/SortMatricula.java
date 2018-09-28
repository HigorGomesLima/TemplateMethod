package templatemethod;

public class SortMatricula extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        int comp = a.getMatricula().compareTo(b.getMatricula());
        return comp < 0;
    }
    
}
