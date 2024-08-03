package artefact01;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MappingController {

	@GetMapping("/")
	public String landingMethod() {
		
		return "Hi";

	}
	
	@GetMapping("/index")
	public ResponseEntity<Resource> indexPage() throws MalformedURLException {

		// Path to the PDF file
		Path path = Paths.get(
				"/Users/jibinkalyattil/eclipse-workspace/artefact01/src/main/java/artefact01/javalearning.html");
		// Load the resource
		Resource resource = new UrlResource(path.toUri());
		// Return ResponseEntity with PDF content type
		return ResponseEntity.ok().contentType(MediaType.TEXT_HTML)
				.body(resource);

	}
	
	@GetMapping("/loadJavaCode")
	public ResponseEntity<Resource> basicAccessmodifiers(@RequestParam String concept) throws MalformedURLException {

		// Path to the PDF file
		String javaClassCode=getClassMappingForConcept(concept);
		Path path = Paths.get(
				"/Users/jibinkalyattil/eclipse-workspace/artefact01/src/main/java/artefact01/"+javaClassCode);
		// Load the resource
		Resource resource = new UrlResource(path.toUri());
		// Return ResponseEntity with PDF content type
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN)
				.body(resource);

	}
	
	private String getClassMappingForConcept(String concept) {
		String classMapped = "BasicsAccessModifiers.java";
		switch(concept) {
			case "access":
				classMapped = "BasicsAccessModifiers.java";
				break;
			case "collections":
				classMapped = "BasicsCollections.java";
				break;
			case "executor":
				classMapped = "BasicsExecutorService.java";
				break;
			case "stream":
				classMapped = "BasicsThreadStreams.java";
				break;
			case "thread":
				classMapped = "BasicsThreadStreams.java";
				break;
			case "sound":
				classMapped = "SoundProcessorPOC.java";
				break;
			default :
				classMapped = "BasicsAccessModifiers.java";
				
		}
		return classMapped;
	}

	@GetMapping("/execute")
	public ResponseEntity<Resource> basicAccessmodifiersExecute(
			@RequestParam String concept) throws IOException, InterruptedException, ExecutionException {
		// Path to the PDF file
		executeClassMappedToConcept(concept);

		Path path = Paths.get(
				"/Users/jibinkalyattil/eclipse-workspace/artefact01/src/main/java/artefact01/output.txt");
		// Load the resource
		Resource resource = new UrlResource(path.toUri());
		// Return ResponseEntity with PDF content type
		return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN)
				.body(resource);
	}

	private void executeClassMappedToConcept(String concept) throws FileNotFoundException, InterruptedException, ExecutionException {
		switch(concept) {
			case "access":
				 BasicsAccessModifiers.main(null);
				 break;
			case "collections":
				BasicsCollections.main(null);
				break;
			case "executor":
				BasicsExecutorService.main(null);
				break;
			case "stream":
				BasicsThreadStreams.main(null);
				break;
			case "thread":
				BasicsThreadStreams.main(null);
				break;
			case "sound":
				SoundProcessorPOC.main(null);
				break;
			default :
				 BasicsAccessModifiers.main(null);
				
		}
		
	}
	
}
