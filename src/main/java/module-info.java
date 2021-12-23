module ModelViewController {
    requires javafx.controls;
    requires transitive javafx.graphics;

    exports triangle;
    opens triangle;
}