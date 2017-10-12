# Muehle
Muehle Spiel für die IT-Talents competition.


HOWTO: Code

/*==========================================*/

1. Kommentare 

/**
 * Gibt den zur KundenID zugehörigen Nachnamen aus
 *
 * @param int kundenID		ID des Kunden
 * @return String name		Name der mit der ID gekoppelt ist
 * @throws Exception		wenn eine ungültige ID gesucht wird
 */
public String getName(int kundenID) throws Exception {
	// Code
	return name;
}

/*==========================================*/

2. Standard Java-Brackets

// Eröffnende Klammern in der selben Zeile wie Kontrollstrukturen und Funktionsdefinitionen
public void foo {
	if(true) {
		// Code
	}
}

/*==========================================*/

3. Namensschema

class myClass {				// Anstatt: "class my_class" 
	public void myFunktion {	// oder: "public void my_function"
	
	}
}

/*==========================================*/

4. Immer das Erwartete zurückgeben

// schlechtes Beispiel:
public String printFullName() {
	if(hasFirstName() && hasLastName()) {
		return getFirstName() + " " + getLastName();
	}

	return null; // <--
}

// besseres Beispiel:
public String printFullName() {
	if(!hasFirstName() || !hasLastName()) {
		return null;
	}

	return getFirstName() + " " + getLastName();
}

/*==========================================*/

5. Verschachtelung wenn es geht vermeiden

// schlechtes Beispiel:
public void uploadFile() {
	if(fileHasBeenCreated()) {
		if(checkFileExtension()) {
			// Upload file
		} else {
			return;
			// Error
		}
	} else {
		return;
		// Error
	}
}

// besseres Beispiel:
public void uploadFile() {
	if(!fileHasBeenCreated()) {
		return;
		// Error
	}
	
	if(!checkFileExtension()) {
		return;
		// Error
	}

	// Upload file
}

/*==========================================*/

Zusätzliche Vereinbarungen

1. Variablen Konventionen:
  lokal:		  blaBla
  Member:		  mBlaBla
  Konstante:	BLA_BLA
  Feld:		    fBlaBla
  Argument:	  blaBlaIn
  Klasse:		  BlaBla
  Interface:	IblaBla
  
2. Einzeilige If-Statements:
  falsch:
    if(x)
      return y;
  richtig:
    if(x) return y;
  oder:
    if(x) {
      return y;
    }
    
3. UI → Logik → KI

4. Test-Driven-Development (TDD) mit Junit
  Arrange → Act → Assert (AAA):
    @Test
    public void add_TwoInts_SumsThemUp() {
      Calculator c = new Calculator();  // Arrange
      int result = c.add(1, 2); 		    // Act
      assertEquals(3, result); 		      // Assert
    }
    
  Namenskonvention:
    Methode → Szenario → Verhalten
      @Test
      public void summe_NullInput_GibtLeerenStringAus() { … }
      
  Exceptions testen
    @Test(expected=IndexOutOfBoundsException.class
      public void testIndexOutOfBoundsException() {
      ArrayList emptyList = new ArrayList();
      Object o = emptyList.get(0);
    }
    
  Zweigüberdeckung (C1)
  
  Interface First (führt zu Black-Box Testing)
    Interface → Test (Make it fail) → Code (Make it work) → Refactor
    Aus dem Interface lässt sich eine Klasse und ein Test generieren in Eclipse
