public class FirstOccurrenceOfWord {    
    public int solve(String A, String B) {
        
        int position = A.indexOf(B);
        if(position >= 0)
        {
            return position + 1;
        }
        {
            return position;
        }
    }
}
