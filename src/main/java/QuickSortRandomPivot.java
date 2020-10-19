import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortRandomPivot {

    private List<Integer> dataSource;

    public QuickSortRandomPivot(List<Integer> dataSource) {
        this.dataSource = new ArrayList<>(dataSource);
    }

    public List<Integer> sort(){
        quickSortRandomPivot(0,this.dataSource.size()-1);
        return this.dataSource;
    }

    private void quickSortRandomPivot( int left , int right){
        if(left >= right){
            return;
        }
        randomPivot(left, right);
        int pivot = this.dataSource.get(right);

        int border = left-1;
        int i = left;
        while(i<right){
            if (this.dataSource.get(i) < pivot){
                border++;
                if (border != i ){
                    swap(border, i , this.dataSource);
                }
            }
            i++;
        }
        border++;
        if (border!=right){
            swap(border , right , this.dataSource);
        }

        quickSortRandomPivot(left  , border-1);
        quickSortRandomPivot(border+1 , right );
    }
    private void randomPivot(int left, int right){
        int range = right - left;
        Random random = new Random();
        int border = left + random.nextInt(range);
        if (border != right){
            swap(border , right , this.dataSource);
        }
    }

    private void swap(int from , int to , List<Integer> data){
        int tmp = data.get(from);
        data.set(from , data.get(to));
        data.set(to,tmp );
    }
}
