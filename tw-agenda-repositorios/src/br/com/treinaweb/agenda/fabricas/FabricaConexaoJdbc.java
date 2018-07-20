package br.com.treinaweb.agenda.fabricas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexaoJdbc {

	public static Connection criarConexao() throws IOException, SQLException {
		InputStream is = FabricaConexaoJdbc.class.getClassLoader().getResourceAsStream("application.properties");
		if (is == null) {
			throw new FileNotFoundException("O arquivo de configuração do banco de dados não foi encontrado.");
		}
		Properties props = new Properties();
		props.load(is);
		Connection conexao = DriverManager.getConnection(props.getProperty("urlConexao"), 
				props.getProperty("usuarioConexao"), props.getProperty("senhaConexao"));
		return conexao;
	}
	
}
