class NewsPaperStore {
    NewsPaper[] newspapers = new NewsPaper[100];
    int index = 0;
	void save(NewsPaper newsPaper) {
        if (newsPaper != null) {
            if (index < newspapers.length) {
                this.newspapers[index] = newsPaper;
                System.out.println("Newspaper saved at index: " + index);
                index++;
            } else {
                System.out.println("Array index out of bounds");
            }
        } else {
            System.out.println("NewsPaper cannot be null");
        }
    }
    void saveAll(NewsPaper[] newsPapers) {
        System.out.println("Saving all newspaper:");
        for (NewsPaper paper : newsPapers) {
            save(paper);
        }
    }
    NewsPaper findByName(String name) {
        if (name != null) {
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];
                if (paper != null && paper.name == name) {
                    System.out.println("Newspaper found:");
                    paper.show();
                    return paper;
                }
            }
        }
        System.out.println("Newspaper not found");
        return null;
    }
   void displayAll() {
        System.out.println("Displaying all newspapers:");
        boolean found = false;
        for (NewsPaper paper : this.newspapers) {
            if (paper != null) {
                paper.show();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No newspapers to display");
        }
    }
   String findPaperQualityByName(String name) {
        if (name != null) {
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];
                if (paper != null && paper.name == name) {
                    System.out.println("Paper found: " + name);
                    System.out.println("Quality: " + paper.paperQuality);
                    return paper.paperQuality;
                }
            }
        }
        System.out.println("Newspaper not found");
        return null;
    }
	int findNoOfPagesByNameAndHeadEditor(String name, String headEditor) {
        if (name != null && headEditor != null) {
            for (int start = 0; start < this.newspapers.length; start++) {
                NewsPaper paper = this.newspapers[start];
                if (paper != null && paper.name == name && paper.headEditor == headEditor) {
                    System.out.println("Newspaper found");
                    System.out.println("Pages: " + paper.noOfPages);
                    return paper.noOfPages;
                }
            }
        }
        System.out.println("Newspaper not found");
        return 0;
    }
   void updateLangByName(String name, Lang newLang) {
        System.out.println("Updating language:");
        if (name != null && newLang != null) {
            for (NewsPaper paper : this.newspapers) {
                if (paper != null && paper.name == name) {
                    paper.lang = newLang;
					System.out.println("Updated language:"+newLang);
					System.out.println("Updated newspaper:");
                    paper.show();
                }
            }
        }
    }
   void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight( InkColor inkColor, int noOfImages, int fontSize,String name, double height, double weight) { 
    System.out.println("Updating newspaper:");
      boolean updated = false;
      if (inkColor != null && name != null) {
         for (int start = 0; start < this.newspapers.length; start++) {
           NewsPaper paper = this.newspapers[start];
               if (paper != null && paper.name == name &&paper.height == height && paper.weight == weight) {
                    System.out.println("Old values:");
                    System.out.println("InkColor: " + paper.inkColor);
                    System.out.println("Images: " + paper.noOfImages);
                    System.out.println("Font Size: " + paper.fontSize);
					System.out.println("--------------------------------");
					paper.inkColor = inkColor;
                    paper.noOfImages = noOfImages;
                    paper.fontSize = fontSize;
					System.out.println("Updated newspaper:");
                    paper.show();
                    updated = true;
                }
            }
            if (!updated) {
                System.out.println("No matching newspaper found");
            }
        }
    }
	void replaceByPrintHouseAddress(String address, NewsPaper newPaper) {
        boolean replaced = false;
        System.out.println("Replacing newspaper:");
         if (address != null && newPaper != null) {
            for (int start = 0; start < this.newspapers.length; start++) {
                if (this.newspapers[start] != null && this.newspapers[start].printHouseAddress == address) {
                    System.out.println("Old newspaper:");
                    this.newspapers[start].show();
                    this.newspapers[start] = newPaper;
                    System.out.println("New newspaper:");
                    newPaper.show();
                    replaced = true;
                }
            }
            if (!replaced) {
                System.out.println("No matching address found");
            }
        }
    }
}