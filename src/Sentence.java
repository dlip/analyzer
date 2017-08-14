import java.util.ArrayList;
import java.util.List;
import com.atilika.kuromoji.unidic.kanaaccent.Token;

public class Sentence {
    public List<Token> tokens = new ArrayList<Token>();
    public String text;
    public String line;
    public Integer line_index;
    public Integer nplus_index;
}
