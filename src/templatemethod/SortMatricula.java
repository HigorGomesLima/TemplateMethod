package templatemethod;

public class SortMatricula extends Sort{

    @Override
    public boolean compare(Professor a, Professor b) {
        int compA = Integer.valueOf(a.getMatricula());
        int compB = Integer.valueOf(b.getMatricula());
        return compA < compB;
    }
    
}
