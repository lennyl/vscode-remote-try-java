public interface FSVisitor {
    void visitFile(File file);
    void visitDirectory(Directory directory);
    void visitLink(Link link);
}
