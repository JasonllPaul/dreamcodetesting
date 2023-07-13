package category.sub;

import category.HomeAppliances;

import java.util.ArrayList;

public class MajorAppliances extends HomeAppliances {

    protected ArrayList<String> keywords;
    private int level = 2;
    public MajorAppliances(){
        super();
        this.keywords = new ArrayList<>();
        this.keywords.add("major appliances");
        this.keywords.add("major");
    }

    public void getKeywords(){
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
