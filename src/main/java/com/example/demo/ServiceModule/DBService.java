package com.example.demo.ServiceModule;

import java.util.Arrays;

import com.example.demo.DominioModule.Pomar;
import com.example.demo.DominioModule.Produtor;
import com.example.demo.DominioModule.RespTecnico;
import com.example.demo.RepositoryModule.PomarRepository;
import com.example.demo.RepositoryModule.ProdutorRepository;
import com.example.demo.RepositoryModule.RespTecnicoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    @Autowired
	private ProdutorRepository produtorRepository;
	@Autowired
	private RespTecnicoRepository respTecnicoRepository;
	@Autowired
	private PomarRepository pomarRepository;
    public void InstanciaBaseDeDados()
    {
        Produtor produtor1 = new Produtor(null, "Marcos Matos", "Alvaro Neri dos Santos", "Bom Jesus", "Lages",
				"Santa Catarina", "88503397", "marcos@gmail.com", "3222-2215", "99931-5839");
		Produtor produtor2 = new Produtor(null, "Caio Santos", "Alvaro Neri dos Santos", "Bom Jesus", "Lages",
				"Santa Catarina", "88503397", "caio@gmail.com", "3222-2215", "99931-5839");
		RespTecnico respTecnico1 = new RespTecnico(null, "Isabela Santos", "Alvaro Neri dos Santos", "Bom Jesus",
				"Lages", "Santa Catarina", "88503397", "isabela@gmail.com", "456418", "3222-2215", "99931-5839");
		RespTecnico respTecnico2 = new RespTecnico(null, "Rose Oliveira", "Alvaro Neri dos Santos", "Bom Jesus",
				"Lages", "Santa Catarina", "88503397", "rose@gmail.com", "568725", "3222-2215", "99931-5839");

		Pomar pomar1 = new Pomar(null, "pomarUm", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor1, respTecnico2);
		Pomar pomar2 = new Pomar(null, "pomarDois", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor1, respTecnico2);
		Pomar pomar3 = new Pomar(null, "pomarTres", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor1, respTecnico1);
		Pomar pomar4 = new Pomar(null, "pomarQuatro", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor1, respTecnico1);
		Pomar pomar5 = new Pomar(null, "pomarCinco", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor2, respTecnico2);
		Pomar pomar6 = new Pomar(null, "pomarSeis", "Alvaro Neri dos Santos", "Bom Jesus", "Lages", "Santa Catarina",
				"88503397", produtor2, respTecnico2);

		produtor1.getPomares().addAll(Arrays.asList(pomar1,pomar2,pomar3,pomar4));
		produtor2.getPomares().addAll(Arrays.asList(pomar5,pomar6));
		respTecnico1.getPomares().addAll(Arrays.asList(pomar3,pomar4));
		respTecnico2.getPomares().addAll(Arrays.asList(pomar1,pomar2,pomar5,pomar6));



		this.produtorRepository.saveAll(Arrays.asList(produtor1,produtor2));
		this.respTecnicoRepository.saveAll(Arrays.asList(respTecnico1,respTecnico2));
		this.pomarRepository.saveAll(Arrays.asList(pomar1,pomar2,pomar3,pomar4,pomar5,pomar6));
    }
}
