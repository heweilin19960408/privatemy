package cn.com.group;

public class TextFile extends AbstractFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该操作");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该操作");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该操作");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("-------对文本文件‘"+name+"'进行杀毒");
    }
}
