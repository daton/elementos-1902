package org.unitec.elementos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosApplication implements CommandLineRunner{
    
    @Autowired
    RepoUsuario repoU;
    
	public static void main(String[] args) {
		SpringApplication.run(ElementosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
    //Aqui iran todas nuestras pruebitas!!!! sin encesidad de UI
        
  //  for(Usuario u:repoU.findAll()){
   //     System.out.println(u);
   // }
     //  System.out.println(repoU.findById(2).get());
     // repoU.save(new Usuario(4, "Floky"));
      //  System.out.println(repoU.findById(1).get());
     // repoU.deleteById(1);
     //  for(Usuario u:repoU.findByNombre("Floky")){
       //    System.out.println(u);
       //}
      
    }

  

}

