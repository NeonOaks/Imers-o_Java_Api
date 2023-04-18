package br.com.alura.linguagensapi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    /**
     *
     */
    private List<Linguagem> linguagens = 
        List.of(
            new Linguagem(
                "Java", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", 
                1),
            
            new Linguagem(
                "PHP", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png", 
                2),

            new Linguagem(
                "Python", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_512x512.png", 
                3),

            new Linguagem(
                "C#", 
                "https://upload.wikimedia.org/wikipedia/commons/4/4f/Csharp_Logo.png", 
                4),

            new Linguagem(
                "C++", 
                "https://superconhecimento.com.br/wp-content/uploads/2021/11/Novo-C-1536x864.png", 
                5),

            new Linguagem(
                "JavaScrit", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_512x512.png", 
                6),
            
            new Linguagem(
                "Swift", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/swift/swift_512x512.png", 
                7),

            new Linguagem(
                "Go", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_512x512.png", 
                8),

            new Linguagem(
                "SQL", 
                "https://upload.wikimedia.org/wikipedia/commons/8/87/Sql_data_base_with_logo.png", 
                9),

            new Linguagem(
                "Ruby", 
                "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_512x512.png", 
                10)
           
        );
         
 
    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        return linguagens;
    }
    
}
