//package br.edu.infnet.appanuncio;
//
//import br.edu.infnet.appanuncio.model.domain.app.Atributo;
//import br.edu.infnet.appanuncio.model.domain.app.Classe;
//import br.edu.infnet.appanuncio.model.domain.app.Projeto;
//import br.edu.infnet.appanuncio.service.AppService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class AppTeste implements ApplicationRunner {
//
//    @Autowired
//    private AppService appService;
//
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//
//        Atributo at1 = new Atributo("nome1", "tipo1", "descricao1");
//        Atributo at2 = new Atributo("nome2", "tipo2", "descricao2");
//        Atributo at3 = new Atributo("nome3", "tipo3", "descricao3");
//
//
//        List<Atributo> atributos = new ArrayList<Atributo>();
//        atributos.add(at1);
//        atributos.add(at2);
//        atributos.add(at3);
//
//        Classe automovel = new Classe();
//        automovel.setNome("Automovel");
//        automovel.setAtributos(atributos);
//
//        Classe imovel = new Classe();
//        imovel.setNome("Imovel");
//        imovel.setAtributos(
//                Arrays.asList(
//                        new Atributo("nome1", "tipo1", "descricao1"),
//                        new Atributo("nome2", "tipo2", "descricao2"),
//                        new Atributo("nome3", "tipo3", "descricao3")
//                )
//        );
//
//        Classe anuncio = new Classe();
//        anuncio.setNome("Anuncio");
//        anuncio.setAtributos(atributos);
//
//        Classe item = new Classe();
//        item.setNome("Item");
//        item.setAtributos(atributos);
//
//        List<Classe> classes = new ArrayList<>();
//        classes.add(automovel);
//        classes.add(imovel);
//        classes.add(anuncio);
//        classes.add(item);
//
//        String dir = "C:\\infnet\\appanuncio\\src\\main\\resources\\";
//        String arq = "app.txt";
//
//        try {
//            try {
//                FileReader fileReader = new FileReader(dir+arq);
//                BufferedReader leitura = new BufferedReader(fileReader);
//
//                Projeto projeto = null;
//
//
//                String linha  = leitura.readLine();
//                while (linha != null){
//                    String[] campos = linha.split(";");
//
//                    switch (campos[0].toUpperCase()) {
//                        case "P":
//
//                            projeto.setNome(campos[1]);
//                            projeto.setDescricao(campos[2]);
//                            projeto.setClasses(classes);
//                            projeto.impressao();
//
//                            break;
//                        case "C":
//
//                            Classe classe = new Classe();
//                            classe.setNome(campos[1]);
//                            classe.setAtributos(atributos);
//
//                            System.out.println("Classe");
//                            System.out.println("Nome:" + campos[1]);
//                            break;
//                        case "A":
//                            Atributo atributo = new Atributo(campos[1], campos[2], campos[3]);
//                            atributos.add(atributo);
//                            break;
//                        default:
//                            break;
//                    }
//
//                    //System.out.println(">>>>>>" + linha);
//                    //System.out.println(">>>>>>" + Arrays.toString(campos));
//
//                    linha = leitura.readLine();
//
//                }
//
//                appService.incluir(projeto);
//
//                leitura.close();
//                fileReader.close();
//            } catch (FileNotFoundException e) {
//                System.out.println(dir+arq);
//                System.out.println("Arquivo não existe");
//            } catch (IOException e) {
//                System.out.println("Problema no fechamento");
//            }
//        }
//        finally {
//            System.out.println("Funcionou");
//        }
//
//
//    }
//}
