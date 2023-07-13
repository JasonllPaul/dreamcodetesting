package category.sub;

import category.HomeAppliances;

import java.util.ArrayList;

public class MinorAppliances extends HomeAppliances {
    protected ArrayList<String> keywords;
    private int level = 2;
    public MinorAppliances() {
        super();
        this.keywords = new ArrayList<>();
        this.keywords.add("minor");
        this.keywords.add("appliances");
        this.keywords.add("minor appliances");
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
