module ExperimentFX_v02 {
	requires javafx.controls;
	requires transitive javafx.graphics;
	requires javafx.fxml;
	requires java.desktop;
	requires java.sql;
		
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}
