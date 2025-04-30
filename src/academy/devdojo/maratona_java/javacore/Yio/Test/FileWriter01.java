package academy.devdojo.maratona_java.javacore.Yio.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWruiter
//Fileriader
//BufferWriter (performanc melhorada)
//Bufferreadder (performanc melhorada)
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true)) {//o true é para manter os dados do arquivo intaquitos, ou seja, ao sxecurar novamente o progream o arquivo nao seja atualizado os dados.
            fw.write("Escrevendo no arquivo\n");
            fw.write("Escrevendo uma segunda linha\n");
            fw.flush();//cospe tudo que tem no buffer
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
