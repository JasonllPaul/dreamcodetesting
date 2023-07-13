package category.sub;

import java.util.ArrayList;

public class GeneralAppliances extends MajorAppliances {

    protected ArrayList<String> keywords;
    private int level = 3;
    public GeneralAppliances() {
        super();
        this.keywords = new ArrayList<>();
    }

    public void getKeywords() {
        if (this.keywords.size() == 0) {
            super.getKeywords();
        } else {
            for (int i = 0; i < this.keywords.size(); i++) {
                System.out.println(this.keywords.get(i));
            }
        }
    }

    public int getLevel(){
        return this.level;
    }
}
