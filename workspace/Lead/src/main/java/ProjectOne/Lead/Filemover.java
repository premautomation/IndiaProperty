package ProjectOne.Lead;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Filemover {

	public static void main(String[] args) {
		
				fileMoverOne();
				//fileMovertwo();
			}

			public static boolean fileMoverOne() {

				boolean status = false;

				final File fromDir = new File(System.getProperty("C:/Users/Temp/workspace/leadreports"));
				final File toDir = new File(System.getProperty("C:/Program Files/Apache Software Foundation/Tomcat 7.0/webapps/leadreports"));

				Path FROM = Paths.get(fromDir + "\\index.html");
				
				Path TO = Paths.get(toDir + "\\index.html");
				// overwrite existing file, if exists
				CopyOption[] options = new CopyOption[] { StandardCopyOption.REPLACE_EXISTING,
						StandardCopyOption.COPY_ATTRIBUTES };
				try {
					Files.copy(FROM, TO, options);
					status = true;
				} catch (IOException e) {
					e.printStackTrace();
					status = false;

				}

				return status;

			}
		
		
		
	}


