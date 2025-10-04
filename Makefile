# Compilador de Java
JAVAC = javac

# Directorio de fuentes
SRC_DIR = .

# Directorio para archivos compilados (opcional)
BIN_DIR = bin

# Archivos fuente Java
SOURCES = $(SRC_DIR)/Main.java $(SRC_DIR)/Student.java $(SRC_DIR)/Course.java

# Archivos compilados (.class)
CLASSES = $(SOURCES:.java=.class)

# Nombre del archivo JAR (opcional)
JAR_FILE = mi_proyecto.jar

# Clase principal (para el JAR)
MAIN_CLASS = Main

# Target por defecto
all: $(CLASSES)

# Regla para compilar archivos .java a .class
%.class: %.java
	$(JAVAC) $<

# Compilar en directorio bin (opcional)
bin: 
	mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)

# Crear JAR ejecutable (opcional)
jar: $(CLASSES)
	jar cfe $(JAR_FILE) $(MAIN_CLASS) *.class

# Ejecutar el programa
run: $(CLASSES)
	java $(MAIN_CLASS)

# Limpiar archivos compilados
clean:
	rm -f *.class
	rm -rf $(BIN_DIR)
	rm -f $(JAR_FILE)

# Ayuda
help:
	@echo "Targets disponibles:"
	@echo "  all    - Compila todos los archivos Java (por defecto)"
	@echo "  bin    - Compila en directorio bin/"
	@echo "  jar    - Crea un archivo JAR ejecutable"
	@echo "  run    - Ejecuta el programa"
	@echo "  clean  - Elimina archivos compilados"
	@echo "  help   - Muestra esta ayuda"

.PHONY: all bin jar run clean help