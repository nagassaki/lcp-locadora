package br.unesp.locadora.demo;

import br.unesp.locadora.model.Caracteristica;
import br.unesp.locadora.model.Categoria;
import br.unesp.locadora.model.Cor;
import br.unesp.locadora.model.Endereco;
import br.unesp.locadora.model.Fatura;
import br.unesp.locadora.model.Fisica;
import br.unesp.locadora.model.Juridica;
import br.unesp.locadora.model.Marca;
import br.unesp.locadora.model.Modelo;
import br.unesp.locadora.model.Pedido;
import br.unesp.locadora.model.Veiculo;
import br.unesp.locadora.service.CaracteristicaService;
import br.unesp.locadora.service.CategoriaService;
import br.unesp.locadora.service.CorService;
import br.unesp.locadora.service.FaturaService;
import br.unesp.locadora.service.FisicaService;
import br.unesp.locadora.service.JuridicaService;
import br.unesp.locadora.service.MarcaService;
import br.unesp.locadora.service.ModeloService;
import br.unesp.locadora.service.PedidoService;
import br.unesp.locadora.service.VeiculoService;
import java.math.BigDecimal;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * Setup do conjunto de dados de teste.
 */
public class DadosDemo {

    /**
     * Serviço de categorias.
     */
    private static CategoriaService categoriaService = new CategoriaService();

    /**
     * Serviço de característica.
     */
    private static CaracteristicaService caracteristicaService = new CaracteristicaService();

    /**
     * Serviço de marca.
     */
    private static MarcaService marcaService = new MarcaService();

    /**
     * Serviço de modelo.
     */
    private static ModeloService modeloService = new ModeloService();

    /**
     * Serviço de cor.
     */
    private static CorService corService = new CorService();

    /**
     * Serviço de veículo.
     */
    private static VeiculoService veiculoService = new VeiculoService();

    /**
     * Serviço de cliente pessoa física.
     */
    private static FisicaService fisicaService = new FisicaService();

    /**
     * Serviço de cliente pessoa jurídica.
     */
    private static JuridicaService juridicaService = new JuridicaService();

    /**
     * Serviço de pedido.
     */
    private static PedidoService pedidoService = new PedidoService();

    /**
     * Serviço de fatura.
     */
    private static FaturaService faturaService = new FaturaService();

    public static void main(String[] args) throws ParseException {

        //////////////////////////////////////////////////
        // Categoria
        //////////////////////////////////////////////////
        
        Categoria economico = new Categoria("Econômico", new BigDecimal(20), new BigDecimal(10));
        Categoria economicoPremium = new Categoria("Econômico Premium", new BigDecimal(30), new BigDecimal(15));
        Categoria intermediario = new Categoria("Intermediário", new BigDecimal(40), new BigDecimal(20));
        Categoria intermediarioPremium = new Categoria("Intermediário Premium", new BigDecimal(50), new BigDecimal(25));
        Categoria executivo = new Categoria("Executivo", new BigDecimal(200), new BigDecimal(100));
        Categoria luxo = new Categoria("Luxo", new BigDecimal(500), new BigDecimal(250));
        Categoria suv = new Categoria("SUV", new BigDecimal(100), new BigDecimal(50));
        Categoria suvPremium = new Categoria("SUV Premium", new BigDecimal(300), new BigDecimal(150));
        Categoria van = new Categoria("Van", new BigDecimal(50), new BigDecimal(25));
        Categoria vanPremium = new Categoria("Van Premium", new BigDecimal(80), new BigDecimal(40));
        Categoria pickup = new Categoria("Pick-Up", new BigDecimal(50), new BigDecimal(25));
        Categoria pickupPremium = new Categoria("Pick-Up Premium", new BigDecimal(300), new BigDecimal(150));
        
        categoriaService.save(economico);
        categoriaService.save(economicoPremium);
        categoriaService.save(intermediario);
        categoriaService.save(intermediarioPremium);
        categoriaService.save(executivo);
        categoriaService.save(luxo);
        categoriaService.save(suv);
        categoriaService.save(suvPremium);
        categoriaService.save(van);
        categoriaService.save(vanPremium);
        categoriaService.save(pickup);
        categoriaService.save(pickupPremium);

        //////////////////////////////////////////////////
        // Característica
        //////////////////////////////////////////////////
        
        Caracteristica duasPortas = new Caracteristica("2 Portas");
        Caracteristica quatroPortas = new Caracteristica("4 Portas");
        Caracteristica duasPessoas = new Caracteristica("2 Pessoas");
        Caracteristica tresPessoas = new Caracteristica("3 Pessoas");
        Caracteristica cincoPessoas = new Caracteristica("5 Pessoas");
        Caracteristica setePessoas = new Caracteristica("7 Pessoas");
        Caracteristica oitoPessoas = new Caracteristica("8 Pessoas");
        Caracteristica direcaoHidraulica = new Caracteristica("Direção Hidráulica");
        Caracteristica direcaoEletrica = new Caracteristica("Direção Elétrica");
        Caracteristica manual = new Caracteristica("Câmbio Manual");
        Caracteristica automatico = new Caracteristica("Câmbio Automático");
        Caracteristica cabineSimples = new Caracteristica("Cabine Simples");
        Caracteristica cabineDupla = new Caracteristica("Cabine Dupla");
        Caracteristica gasolina = new Caracteristica("Gasolina");
        Caracteristica etanol = new Caracteristica("Etanol");
        Caracteristica flex = new Caracteristica("Flex");
        Caracteristica diesel = new Caracteristica("Diesel");
        Caracteristica eletrico = new Caracteristica("Elétrico");
        Caracteristica ar = new Caracteristica("Ar-Condicionado");
        Caracteristica vidro = new Caracteristica("Vidro Elétrico");
        Caracteristica trava = new Caracteristica("Trava Elétrica");
        Caracteristica airbag = new Caracteristica("Air Bag");
        Caracteristica abs = new Caracteristica("ABS");

        caracteristicaService.save(duasPortas);
        caracteristicaService.save(quatroPortas);
        caracteristicaService.save(duasPessoas);
        caracteristicaService.save(tresPessoas);
        caracteristicaService.save(cincoPessoas);
        caracteristicaService.save(setePessoas);
        caracteristicaService.save(oitoPessoas);
        caracteristicaService.save(direcaoHidraulica);
        caracteristicaService.save(direcaoEletrica);
        caracteristicaService.save(manual);
        caracteristicaService.save(automatico);
        caracteristicaService.save(cabineSimples);
        caracteristicaService.save(cabineDupla);
        caracteristicaService.save(gasolina);
        caracteristicaService.save(etanol);
        caracteristicaService.save(flex);
        caracteristicaService.save(diesel);
        caracteristicaService.save(eletrico);
        caracteristicaService.save(ar);
        caracteristicaService.save(vidro);
        caracteristicaService.save(trava);
        caracteristicaService.save(airbag);
        caracteristicaService.save(abs);

        //////////////////////////////////////////////////
        // Marca
        //////////////////////////////////////////////////
        
        Marca toyota = new Marca("Toyota");
        Marca honda = new Marca("Honda");
        Marca nissan = new Marca("Nissan");
        Marca mitsubishi = new Marca("Mitsubishi");
        Marca fiat = new Marca("Fiat");
        Marca renault = new Marca("Renault");
        Marca peugeot = new Marca("Peugeot");
        Marca citroen = new Marca("Citroën");
        Marca volkswagen = new Marca("Volkswagen");
        Marca chevrolet = new Marca("Chevrolet");
        Marca ford = new Marca("Ford");
        Marca jeep = new Marca("Jeep");
        Marca chery = new Marca("Chery");
        Marca jac = new Marca("JAC");
        Marca hyundai = new Marca("Hyundai");
        Marca kia = new Marca("Kia");

        marcaService.save(toyota);
        marcaService.save(honda);
        marcaService.save(nissan);
        marcaService.save(mitsubishi);
        marcaService.save(fiat);
        marcaService.save(renault);
        marcaService.save(peugeot);
        marcaService.save(citroen);
        marcaService.save(volkswagen);
        marcaService.save(chevrolet);
        marcaService.save(ford);
        marcaService.save(jeep);
        marcaService.save(chery);
        marcaService.save(jac);
        marcaService.save(hyundai);
        marcaService.save(kia);

        //////////////////////////////////////////////////
        // Modelo
        //////////////////////////////////////////////////
        
        Modelo hiluxSimples = new Modelo(toyota, pickupPremium, 2019, "Hilux Cabine Simples", Arrays.asList(duasPortas, duasPessoas, ar, airbag, vidro, trava, diesel, manual, direcaoHidraulica, abs, cabineSimples));
        Modelo hiluxDupla = new Modelo(toyota, pickupPremium, 2019, "Hilux Cabine Dupla", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, diesel, manual, direcaoHidraulica, abs, cabineDupla));
        Modelo rav4 = new Modelo(toyota, suvPremium, 2019, "RAV4", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo sw4 = new Modelo(toyota, suvPremium, 2019, "SW4", Arrays.asList(quatroPortas, setePessoas, ar, airbag, vidro, trava, diesel, automatico, direcaoHidraulica, abs));
        Modelo prius = new Modelo(toyota, executivo, 2019, "Prius", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo yaris = new Modelo(toyota, intermediarioPremium, 2019, "Yaris", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo etios = new Modelo(toyota, intermediarioPremium, 2019, "Etios", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, direcaoEletrica));
        Modelo corolla = new Modelo(toyota, executivo, 2019, "Corolla", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo camry = new Modelo(toyota, luxo, 2019, "Camry", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));

        modeloService.save(hiluxSimples);
        modeloService.save(hiluxDupla);
        modeloService.save(rav4);
        modeloService.save(sw4);
        modeloService.save(prius);
        modeloService.save(yaris);
        modeloService.save(etios);
        modeloService.save(corolla);
        modeloService.save(camry);

        Modelo fit = new Modelo(honda, intermediarioPremium, 2019, "Fit", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, direcaoEletrica, abs));
        Modelo wrv = new Modelo(honda, suvPremium, 2019, "WR-V", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo hrv = new Modelo(honda, suvPremium, 2019, "HR-V", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo crv = new Modelo(honda, suvPremium, 2019, "CR-V", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo city = new Modelo(honda, executivo, 2019, "City", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo civic = new Modelo(honda, executivo, 2019, "Civic", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo accord = new Modelo(honda, luxo, 2019, "Accord", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));

        modeloService.save(fit);
        modeloService.save(wrv);
        modeloService.save(hrv);
        modeloService.save(crv);
        modeloService.save(city);
        modeloService.save(civic);
        modeloService.save(accord);

        Modelo march = new Modelo(nissan, economicoPremium, 2019, "March", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, manual, direcaoEletrica));
        Modelo versa = new Modelo(nissan, executivo, 2019, "Versa", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo sentra = new Modelo(nissan, executivo, 2019, "Sentra", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo kicks = new Modelo(nissan, suv, 2019, "Kicks", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo frontier = new Modelo(nissan, pickup, 2019, "Frontier", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, diesel, automatico, direcaoEletrica, abs, cabineDupla));

        modeloService.save(march);
        modeloService.save(versa);
        modeloService.save(sentra);
        modeloService.save(kicks);
        modeloService.save(frontier);

        Modelo l200 = new Modelo(mitsubishi, pickupPremium, 2019, "L200 Triton", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, diesel, manual, direcaoHidraulica, abs, cabineDupla));
        Modelo asx = new Modelo(mitsubishi, suvPremium, 2019, "ASX", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo eclipse = new Modelo(mitsubishi, suvPremium, 2019, "Eclipse Cross", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo outlander = new Modelo(mitsubishi, suvPremium, 2019, "Outlander", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo pajero = new Modelo(mitsubishi, suvPremium, 2019, "Pajero Full", Arrays.asList(quatroPortas, setePessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));
        Modelo lancer = new Modelo(mitsubishi, luxo, 2019, "Lancer", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, gasolina, automatico, direcaoEletrica, abs));

        modeloService.save(l200);
        modeloService.save(asx);
        modeloService.save(eclipse);
        modeloService.save(outlander);
        modeloService.save(pajero);
        modeloService.save(lancer);

        Modelo mobi = new Modelo(fiat, economico, 2019, "Mobi", Arrays.asList(quatroPortas, cincoPessoas, airbag, flex, manual));
        Modelo uno = new Modelo(fiat, economicoPremium, 2019, "Uno", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, flex, manual, direcaoHidraulica, abs));
        Modelo argo = new Modelo(fiat, intermediarioPremium, 2019, "Argo", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, direcaoEletrica, abs));
        Modelo cronos = new Modelo(fiat, intermediarioPremium, 2019, "Cronos", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs));
        Modelo toro = new Modelo(fiat, pickupPremium, 2019, "Toro", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, automatico, direcaoEletrica, abs, cabineDupla));
        Modelo siena = new Modelo(fiat, intermediario, 2019, "Grand Siena", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, flex, manual, direcaoHidraulica, abs));
        Modelo weekend = new Modelo(fiat, intermediario, 2019, "Weekend", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, direcaoHidraulica, abs));
        Modelo strada = new Modelo(fiat, pickup, 2019, "Strada", Arrays.asList(duasPortas, duasPessoas, airbag, flex, manual, abs, cabineDupla));
        Modelo doblo = new Modelo(fiat, intermediario, 2019, "Doblò", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, direcaoHidraulica, abs));
        Modelo fiorino = new Modelo(fiat, van, 2019, "Fiorino", Arrays.asList(duasPortas, duasPessoas, flex, manual, abs));
        Modelo ducato = new Modelo(fiat, van, 2019, "Ducato", Arrays.asList(duasPortas, tresPessoas, vidro, trava, diesel, manual, direcaoHidraulica, abs));

        modeloService.save(mobi);
        modeloService.save(uno);
        modeloService.save(argo);
        modeloService.save(cronos);
        modeloService.save(toro);
        modeloService.save(siena);
        modeloService.save(weekend);
        modeloService.save(strada);
        modeloService.save(doblo);
        modeloService.save(fiorino);
        modeloService.save(ducato);

        Modelo kwid = new Modelo(renault, suv, 2019, "Kwid", Arrays.asList(quatroPortas, cincoPessoas, airbag, flex, manual, abs));
        Modelo captur = new Modelo(renault, suvPremium, 2019, "Captur", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, abs));
        Modelo oroch = new Modelo(renault, pickup, 2019, "Duster Oroch", Arrays.asList(quatroPortas, cincoPessoas, flex, manual, direcaoEletrica, abs, cabineDupla));
        Modelo duster = new Modelo(renault, suv, 2019, "Duster", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, flex, manual, abs));
        Modelo stepway = new Modelo(renault, intermediario, 2019, "Stepway", Arrays.asList(quatroPortas, cincoPessoas, airbag, trava, manual, flex, direcaoEletrica, abs));
        Modelo sandero = new Modelo(renault, intermediario, 2019, "Sandero", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, trava, manual, flex, direcaoEletrica, abs));
        Modelo logan = new Modelo(renault, intermediario, 2019, "Logan", Arrays.asList(quatroPortas, cincoPessoas, airbag, manual, flex, direcaoEletrica, abs));
        Modelo zoe = new Modelo(renault, economico, 2019, "Zoe", Arrays.asList(quatroPortas, cincoPessoas, automatico, eletrico));
        Modelo master = new Modelo(renault, vanPremium, 2019, "Master", Arrays.asList(quatroPortas, duasPessoas, airbag, automatico, diesel, abs));

        modeloService.save(kwid);
        modeloService.save(captur);
        modeloService.save(oroch);
        modeloService.save(duster);
        modeloService.save(stepway);
        modeloService.save(sandero);
        modeloService.save(logan);
        modeloService.save(zoe);
        modeloService.save(master);

        Modelo duzentos = new Modelo(peugeot, intermediario, 2019, "208", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, abs));
        Modelo tresMil = new Modelo(peugeot, suv, 2019, "3008", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, manual, gasolina));
        Modelo cicoMil = new Modelo(peugeot, suvPremium, 2019, "5008", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));
        Modelo partner = new Modelo(peugeot, van, 2019, "Partner", Arrays.asList(duasPortas, duasPessoas, ar, airbag, manual, flex));
        Modelo expert = new Modelo(peugeot, vanPremium, 2019, "Expert", Arrays.asList(duasPortas, duasPessoas, ar, airbag, manual, diesel, abs));
        Modelo boxer = new Modelo(peugeot, vanPremium, 2019, "Boxer", Arrays.asList(quatroPortas, duasPessoas, ar, airbag, manual, diesel, abs));

        modeloService.save(duzentos);
        modeloService.save(tresMil);
        modeloService.save(cicoMil);
        modeloService.save(partner);
        modeloService.save(expert);
        modeloService.save(boxer);

        Modelo c3 = new Modelo(citroen, intermediarioPremium, 2019, "C3", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, direcaoEletrica, abs));
        Modelo aircross = new Modelo(citroen, suv, 2019, "Aircross", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, abs));
        Modelo lounge = new Modelo(citroen, executivo, 2019, "C4 Lounge", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, automatico, direcaoHidraulica, flex));
        Modelo cactus = new Modelo(citroen, suv, 2019, "C4 Cactus", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, automatico, direcaoEletrica, flex));
        Modelo jumpy = new Modelo(citroen, vanPremium, 2019, "Jumpy", Arrays.asList(quatroPortas, tresPessoas, ar, airbag, vidro, manual, diesel, abs));
        Modelo berlingo = new Modelo(citroen, van, 2019, "Berlingo", Arrays.asList(duasPortas, duasPessoas, ar, manual, flex, abs));

        modeloService.save(c3);
        modeloService.save(aircross);
        modeloService.save(lounge);
        modeloService.save(cactus);
        modeloService.save(jumpy);
        modeloService.save(berlingo);

        Modelo up = new Modelo(volkswagen, economicoPremium, 2019, "up!", Arrays.asList(quatroPortas, cincoPessoas, ar, manual, flex));
        Modelo gol = new Modelo(volkswagen, intermediario, 2019, "Gol", Arrays.asList(quatroPortas, cincoPessoas, ar, manual, flex));
        Modelo fox = new Modelo(volkswagen, intermediario, 2019, "Fox", Arrays.asList(quatroPortas, cincoPessoas, ar, manual, flex));
        Modelo polo = new Modelo(volkswagen, intermediario, 2019, "Novo Polo", Arrays.asList(quatroPortas, cincoPessoas, ar, manual, flex));
        Modelo golf = new Modelo(volkswagen, executivo, 2019, "Golf", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo virtus = new Modelo(volkswagen, executivo, 2019, "Virtus", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo voyage = new Modelo(volkswagen, executivo, 2019, "Voyage", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo jetta = new Modelo(volkswagen, executivo, 2019, "Jetta", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo passat = new Modelo(volkswagen, executivo, 2019, "Passat", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo tcross = new Modelo(volkswagen, suvPremium, 2019, "T-Cross", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo tiguan = new Modelo(volkswagen, suvPremium, 2019, "Tiguan Allspace", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo spacefox = new Modelo(volkswagen, intermediario, 2019, "SpaceFox", Arrays.asList(quatroPortas, cincoPessoas, ar, manual, flex));
        Modelo saveiro = new Modelo(volkswagen, pickup, 2019, "Saveiro", Arrays.asList(duasPortas, cincoPessoas, ar, manual, flex, cabineDupla));
        Modelo amorok = new Modelo(volkswagen, pickupPremium, 2019, "Amarok", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, diesel, abs, cabineDupla));

        modeloService.save(up);
        modeloService.save(gol);
        modeloService.save(fox);
        modeloService.save(polo);
        modeloService.save(golf);
        modeloService.save(virtus);
        modeloService.save(voyage);
        modeloService.save(jetta);
        modeloService.save(passat);
        modeloService.save(tcross);
        modeloService.save(tiguan);
        modeloService.save(spacefox);
        modeloService.save(saveiro);
        modeloService.save(amorok);

        Modelo onix = new Modelo(chevrolet, intermediarioPremium, 2019, "Onix", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, abs));
        Modelo prisma = new Modelo(chevrolet, intermediarioPremium, 2019, "Prisma", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, direcaoEletrica, abs));
        Modelo cobalt = new Modelo(chevrolet, intermediarioPremium, 2019, "Cobalt", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, abs));
        Modelo spin = new Modelo(chevrolet, suv, 2019, "Spin", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, abs));
        Modelo cruze = new Modelo(chevrolet, executivo, 2019, "Cruze", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, direcaoEletrica, abs));
        Modelo tracker = new Modelo(chevrolet, suvPremium, 2019, "Tracker", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));
        Modelo equinox = new Modelo(chevrolet, suvPremium, 2019, "Equinox", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, direcaoEletrica, abs));
        Modelo trailblazer = new Modelo(chevrolet, suvPremium, 2019, "Trailblazer", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, direcaoEletrica, abs));
        Modelo montana = new Modelo(chevrolet, pickup, 2019, "Montana", Arrays.asList(quatroPortas, duasPessoas, ar, airbag, vidro, trava, manual, flex, direcaoHidraulica, abs, cabineSimples));
        Modelo s10 = new Modelo(chevrolet, pickupPremium, 2019, "S10", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs, cabineDupla));

        modeloService.save(onix);
        modeloService.save(prisma);
        modeloService.save(cobalt);
        modeloService.save(spin);
        modeloService.save(cruze);
        modeloService.save(tracker);
        modeloService.save(equinox);
        modeloService.save(trailblazer);
        modeloService.save(montana);
        modeloService.save(s10);

        Modelo ka = new Modelo(ford, economico, 2019, "Ka", Arrays.asList(quatroPortas, cincoPessoas, manual, flex));
        Modelo kaSedan = new Modelo(ford, intermediario, 2019, "Ka Sedãn", Arrays.asList(quatroPortas, cincoPessoas, manual, flex));
        Modelo fiesta = new Modelo(ford, intermediario, 2019, "New Fiesta", Arrays.asList(quatroPortas, cincoPessoas, manual, flex));
        Modelo focus = new Modelo(ford, intermediarioPremium, 2019, "Focus", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, abs));
        Modelo fusion = new Modelo(ford, executivo, 2019, "Fusion", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));
        Modelo ecosport = new Modelo(ford, suv, 2019, "EcoSport", Arrays.asList(quatroPortas, cincoPessoas, manual, flex));
        Modelo edge = new Modelo(ford, suvPremium, 2019, "Novo Edge ST", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo ranger = new Modelo(ford, pickupPremium, 2019, "Ranger", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs, cabineDupla));

        modeloService.save(ka);
        modeloService.save(kaSedan);
        modeloService.save(fiesta);
        modeloService.save(focus);
        modeloService.save(fusion);
        modeloService.save(ecosport);
        modeloService.save(edge);
        modeloService.save(ranger);

        Modelo renegade = new Modelo(jeep, suv, 2019, "Renegade", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, direcaoEletrica, abs));
        Modelo compass = new Modelo(jeep, suvPremium, 2019, "Compass", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, direcaoEletrica, abs));
        Modelo cherokee = new Modelo(jeep, suvPremium, 2019, "Grand Cherokee", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));

        modeloService.save(renegade);
        modeloService.save(compass);
        modeloService.save(cherokee);

        Modelo qq = new Modelo(chery, economico, 2019, "QQ", Arrays.asList(duasPortas, cincoPessoas, airbag, vidro, manual, flex, abs));
        Modelo triggo2 = new Modelo(chery, suvPremium, 2019, "Triggo 2", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, direcaoHidraulica, abs));
        Modelo arrizo = new Modelo(chery, executivo, 2019, "Arrizo 5", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo triggo5x = new Modelo(chery, suvPremium, 2019, "Triggo 5X", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, abs));
        Modelo trigo7 = new Modelo(chery, suvPremium, 2019, "Triggo 7", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, manual, flex, direcaoEletrica, abs));

        modeloService.save(qq);
        modeloService.save(triggo2);
        modeloService.save(arrizo);
        modeloService.save(triggo5x);
        modeloService.save(trigo7);

        Modelo iev40 = new Modelo(jac, suv, 2019, "IEV 40", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, automatico, eletrico));
        Modelo t80 = new Modelo(jac, suvPremium, 2019, "T80", Arrays.asList(quatroPortas, setePessoas, ar, airbag, vidro, trava, manual, gasolina, direcaoEletrica, abs));
        Modelo t50 = new Modelo(jac, suvPremium, 2019, "T50", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, gasolina, abs));
        Modelo t40 = new Modelo(jac, suv, 2019, "T40", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, abs));

        modeloService.save(iev40);
        modeloService.save(t80);
        modeloService.save(t50);
        modeloService.save(t40);

        Modelo hb20 = new Modelo(hyundai, intermediarioPremium, 2019, "HB20", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, manual, flex, abs));
        Modelo elantra = new Modelo(hyundai, executivo, 2019, "Elantra", Arrays.asList(quatroPortas, cincoPessoas, ar , airbag, automatico, vidro, trava, flex, abs));
        Modelo creta = new Modelo(hyundai, suvPremium, 2019, "Creta", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, manual, flex, abs));
        Modelo ix35 = new Modelo(hyundai, suv, 2019, "ix35", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, automatico, flex, abs));
        Modelo santaFe = new Modelo(hyundai, suvPremium, 2019, "Santa Fé", Arrays.asList(quatroPortas, setePessoas, ar, airbag, vidro, trava, automatico, gasolina, direcaoEletrica, abs));

        modeloService.save(hb20);
        modeloService.save(elantra);
        modeloService.save(creta);
        modeloService.save(ix35);
        modeloService.save(santaFe);

        Modelo soul = new Modelo(kia, intermediarioPremium, 2019, "Soul", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo cerato = new Modelo(kia, executivo, 2019, "Cerato", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo stinger = new Modelo(kia, luxo, 2019, "Stinger", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));
        Modelo sportage = new Modelo(kia, suv, 2019, "Sportage", Arrays.asList(quatroPortas, cincoPessoas, ar, airbag, vidro, trava, automatico, flex, abs));
        Modelo sorento = new Modelo(kia, suvPremium, 2019, "Sorento", Arrays.asList(quatroPortas, setePessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));
        Modelo carnival = new Modelo(kia, suvPremium, 2019, "Grand Carnival", Arrays.asList(quatroPortas, oitoPessoas, ar, airbag, vidro, trava, automatico, gasolina, abs));

        modeloService.save(soul);
        modeloService.save(cerato);
        modeloService.save(stinger);
        modeloService.save(sportage);
        modeloService.save(sorento);
        modeloService.save(carnival);

        //////////////////////////////////////////////////
        // Cor
        //////////////////////////////////////////////////
        
        Cor prata = new Cor("Prata");
        Cor preto = new Cor("Preto");
        Cor branco = new Cor("Branco");
        Cor cinza = new Cor("Cinza");
        Cor vermelho = new Cor("Vermelho");

        corService.save(prata);
        corService.save(preto);
        corService.save(branco);
        corService.save(cinza);
        corService.save(vermelho);

        //////////////////////////////////////////////////
        // Veículo
        //////////////////////////////////////////////////
        
        veiculoService.save(new Veiculo(hiluxSimples, prata, "GJD6696", "92310486078"));
        veiculoService.save(new Veiculo(hiluxDupla, prata, "CRN9782", "39006842190"));
        veiculoService.save(new Veiculo(rav4, prata, "GCF5081", "25788669562"));
        veiculoService.save(new Veiculo(sw4, prata, "FFB3950", "09163556915"));
        veiculoService.save(new Veiculo(prius, prata, "CLG0937", "29411004466"));
        veiculoService.save(new Veiculo(yaris, prata, "CKD8490", "08550327326"));
        veiculoService.save(new Veiculo(etios, prata, "CDO3095", "81449200392"));
        veiculoService.save(new Veiculo(corolla, prata, "BZI1456", "86284452294"));
        veiculoService.save(new Veiculo(camry, prata, "GDT8369", "09630389806"));

        veiculoService.save(new Veiculo(fit, prata, "CBP6843", "21177229902"));
        veiculoService.save(new Veiculo(wrv, prata, "FXW2379", "86290411065"));
        veiculoService.save(new Veiculo(hrv, prata, "BIE9515", "15500341018"));
        veiculoService.save(new Veiculo(crv, prata, "GEX6475", "98691235695"));
        veiculoService.save(new Veiculo(city, prata, "DCI2433", "88928152085"));
        veiculoService.save(new Veiculo(civic, prata, "BXV5782", "85402950177"));
        veiculoService.save(new Veiculo(accord, prata, "EDH6049", "32895629613"));

        veiculoService.save(new Veiculo(march, prata, "BUY1145", "76903336669"));
        veiculoService.save(new Veiculo(versa, prata, "EEF0927", "75832268552"));
        veiculoService.save(new Veiculo(sentra, prata, "FSX3775", "87784171217"));
        veiculoService.save(new Veiculo(kicks, prata, "DTY0260", "22837666776"));
        veiculoService.save(new Veiculo(frontier, prata, "DMX2691", "38693381156"));

        veiculoService.save(new Veiculo(l200, prata, "DSB2133", "50413225247"));
        veiculoService.save(new Veiculo(asx, prata, "FGT7895", "95491527779"));
        veiculoService.save(new Veiculo(eclipse, prata, "BYE0407", "57071263644"));
        veiculoService.save(new Veiculo(outlander, prata, "BQY8257", "52838358678"));
        veiculoService.save(new Veiculo(pajero, prata, "FJB5337", "31808559010"));
        veiculoService.save(new Veiculo(lancer, prata, "CZZ8413", "67458161854"));

        veiculoService.save(new Veiculo(mobi, prata, "ENW8059", "59966583647"));
        veiculoService.save(new Veiculo(uno, prata, "ENR1814", "96279496120"));
        veiculoService.save(new Veiculo(argo, prata, "BPF8751", "43713039276"));
        veiculoService.save(new Veiculo(cronos, prata, "EIZ6944", "66622103574"));
        veiculoService.save(new Veiculo(toro, prata, "CNG8591", "77326708497"));
        veiculoService.save(new Veiculo(siena, prata, "BYG0273", "07196447558"));
        veiculoService.save(new Veiculo(weekend, prata, "FUO9612", "42445974287"));
        veiculoService.save(new Veiculo(strada, prata, "EYA8865", "60235102370"));
        veiculoService.save(new Veiculo(doblo, prata, "CVY6061", "96960254093"));
        veiculoService.save(new Veiculo(fiorino, prata, "EZM4220", "51039991738"));
        veiculoService.save(new Veiculo(ducato, prata, "EDO9325", "32046492591"));

        veiculoService.save(new Veiculo(kwid, prata, "END5346", "22686044682"));
        veiculoService.save(new Veiculo(captur, prata, "CZH2387", "91733972296"));
        veiculoService.save(new Veiculo(oroch, prata, "CJE1041", "91895651860"));
        veiculoService.save(new Veiculo(duster, prata, "ELB2390", "43496029901"));
        veiculoService.save(new Veiculo(stepway, prata, "DGT9342", "70913069540"));
        veiculoService.save(new Veiculo(sandero, prata, "CFM0939", "49996825285"));
        veiculoService.save(new Veiculo(logan, prata, "GEX7440", "12065966523"));
        veiculoService.save(new Veiculo(zoe, prata, "GFB0194", "73154795068"));
        veiculoService.save(new Veiculo(master, prata, "FDP8091", "37936584776"));

        veiculoService.save(new Veiculo(duzentos, prata, "CNN3130", "58984648927"));
        veiculoService.save(new Veiculo(tresMil, prata, "DKA5893", "79779940398"));
        veiculoService.save(new Veiculo(cicoMil, prata, "DYM3124", "83285885769"));
        veiculoService.save(new Veiculo(partner, prata, "CVT8689", "95990182548"));
        veiculoService.save(new Veiculo(expert, prata, "EWX4978", "73118007314"));
        veiculoService.save(new Veiculo(boxer, prata, "CSA9214", "82174173851"));

        veiculoService.save(new Veiculo(c3, prata, "EGN2562", "57947506237"));
        veiculoService.save(new Veiculo(aircross, prata, "EYS2505", "58139266234"));
        veiculoService.save(new Veiculo(lounge, prata, "FKJ3074", "42859497351"));
        veiculoService.save(new Veiculo(cactus, prata, "DQL3464", "20260913167"));
        veiculoService.save(new Veiculo(jumpy, prata, "DWH8279", "33109564550"));
        veiculoService.save(new Veiculo(berlingo, prata, "GBK8550", "69366291219"));

        veiculoService.save(new Veiculo(up, prata, "FBT2523", "21946107354"));
        veiculoService.save(new Veiculo(gol, prata, "ENW9799", "99928831441"));
        veiculoService.save(new Veiculo(fox, prata, "CCJ9745", "35227378825"));
        veiculoService.save(new Veiculo(polo, prata, "FZC0260", "71139752632"));
        veiculoService.save(new Veiculo(golf, prata, "FRG6295", "47216442423"));
        veiculoService.save(new Veiculo(virtus, prata, "FRB7326", "77864801902"));
        veiculoService.save(new Veiculo(voyage, prata, "GFV3628", "84165624168"));
        veiculoService.save(new Veiculo(jetta, prata, "FJU2078", "90265499165"));
        veiculoService.save(new Veiculo(passat, prata, "CVR2571", "62266815804"));
        veiculoService.save(new Veiculo(tcross, prata, "CAR0635", "43463758165"));
        veiculoService.save(new Veiculo(tiguan, prata, "GEK8096", "21509140176"));
        veiculoService.save(new Veiculo(spacefox, prata, "DES6811", "36708980520"));
        veiculoService.save(new Veiculo(saveiro, prata, "EIE7872", "87093204154"));
        veiculoService.save(new Veiculo(amorok, prata, "GFI9223", "65332868332"));

        veiculoService.save(new Veiculo(onix, prata, "CPL0946", "11141790909"));
        veiculoService.save(new Veiculo(prisma, prata, "EBM4292", "50798248781"));
        veiculoService.save(new Veiculo(cobalt, prata, "DLW2065", "62195558006"));
        veiculoService.save(new Veiculo(spin, prata, "FJS6736", "99711163358"));
        veiculoService.save(new Veiculo(cruze, prata, "EUV8373", "39133738480"));
        veiculoService.save(new Veiculo(tracker, prata, "GJS8341", "38159074476"));
        veiculoService.save(new Veiculo(equinox, prata, "DMK6455", "92370051388"));
        veiculoService.save(new Veiculo(trailblazer, prata, "FJM1171", "82883724949"));
        veiculoService.save(new Veiculo(montana, prata, "GGX7156", "50882276928"));
        veiculoService.save(new Veiculo(s10, prata, "EIJ6989", "26326198664"));

        veiculoService.save(new Veiculo(ka, prata, "FFN5370", "98517418216"));
        veiculoService.save(new Veiculo(kaSedan, prata, "ECA1601", "61528446683"));
        veiculoService.save(new Veiculo(fiesta, prata, "EEC4136", "90658768161"));
        veiculoService.save(new Veiculo(focus, prata, "FUS1626", "11116704760"));
        veiculoService.save(new Veiculo(fusion, prata, "BUT6817", "29544880178"));
        veiculoService.save(new Veiculo(ecosport, prata, "DXZ4788", "10543678471"));
        veiculoService.save(new Veiculo(edge, prata, "EHL2907", "19157023355"));
        veiculoService.save(new Veiculo(ranger, prata, "FLH2285", "77621041660"));

        veiculoService.save(new Veiculo(renegade, prata, "BWP9158", "15076012091"));
        veiculoService.save(new Veiculo(compass, prata, "BSC6316", "48439059334"));
        veiculoService.save(new Veiculo(cherokee, prata, "DNZ6985", "66558274105"));

        Veiculo v1 = new Veiculo(qq, prata, "CIH2284", "29559736370");
        Veiculo v2 = new Veiculo(triggo2, prata, "CPW6480", "96525928027");
        Veiculo v3 = new Veiculo(arrizo, prata, "CRK2922", "52278513037");
        Veiculo v4 = new Veiculo(triggo5x, prata, "BNV6109", "74344706579");
        Veiculo v5 = new Veiculo(trigo7, prata, "EBG5278", "48745679905");

        veiculoService.save(v1);
        veiculoService.save(v2);
        veiculoService.save(v3);
        veiculoService.save(v4);
        veiculoService.save(v5);

        veiculoService.save(new Veiculo(iev40, prata, "BJI0975", "25383236962"));
        veiculoService.save(new Veiculo(t80, prata, "FAU0813", "90643946735"));
        veiculoService.save(new Veiculo(t50, prata, "BHS1348", "64629945485"));
        veiculoService.save(new Veiculo(t40, prata, "CIM2818", "29243138235"));

        veiculoService.save(new Veiculo(hb20, prata, "BQX0818", "63217935069"));
        veiculoService.save(new Veiculo(elantra, prata, "FLJ8555", "72889569263"));
        veiculoService.save(new Veiculo(creta, prata, "CZS8775", "89707394777"));
        veiculoService.save(new Veiculo(ix35, prata, "EKL7973", "01921165046"));
        veiculoService.save(new Veiculo(santaFe, prata, "EGJ1604", "48809881173"));

        veiculoService.save(new Veiculo(soul, prata, "EDT3016", "17271747328"));
        veiculoService.save(new Veiculo(cerato, prata, "FRZ7130", "24232339012"));
        veiculoService.save(new Veiculo(stinger, prata, "DZN1492", "18226874918"));
        veiculoService.save(new Veiculo(sportage, prata, "ETK6334", "48348275018"));
        veiculoService.save(new Veiculo(sorento, prata, "DLX7216", "33359668735"));
        veiculoService.save(new Veiculo(carnival, prata, "DZQ9221", "29536880784"));

        //////////////////////////////////////////////////
        // Cliente - Física
        //////////////////////////////////////////////////
        
        Fisica f1 = new Fisica("Leandro Julio Bento Teixeira", "89883140690", "295242152", LocalDate.parse("20/03/1948", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "1936406696", "leandrojuliobentoteixeira@avoeazul.com.br", new Endereco("13504257", "SP", "Rio Claro", "Jardim Bela Vista", "Rua 14", 394));
        Fisica f2 = new Fisica("Kauê Jorge Galvão", "42855390044", "148451317", LocalDate.parse("01/11/1997", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "1928992793", "kauejorgegalvao-89@mpv.org.br", new Endereco("13506319", "SP", "Rio Claro", "Residencial Florença", "Rua 50 RF", 630));
        Fisica f3 = new Fisica("Kaique Raimundo João Moraes", "79150212575", "306886522", LocalDate.parse("02/07/1974", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "1937887915", "kaiqueraimundojoaomoraes@grupogil.com.br", new Endereco("13502192", "SP", "Rio Claro", "Jardim Residencial das Palmeiras", "Rua 16 JP", 608));
        Fisica f4 = new Fisica("Erick Cauã Novaes", "70414931050", "212284228", LocalDate.parse("10/02/1971", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "1936316356", "eerickcauanovaes@infortec.com.br", new Endereco("13504605", "SP", "Rio Claro", "Jardim Residencial Santa Eliza", "Rua 26 SE", 143));
        Fisica f5 = new Fisica("Igor Anthony Luiz Carvalho", "57130161370", "200704187", LocalDate.parse("21/12/1987", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "1939497350", "igoranthonyluizcarvalho@riobc.com.br", new Endereco("13502411", "SP", "Rio Claro", "Jardim Guanabara", "Rua 3 JG", 256));

        fisicaService.save(f1);
        fisicaService.save(f2);
        fisicaService.save(f3);
        fisicaService.save(f4);
        fisicaService.save(f5);

        fisicaService.save(new Fisica("Antônia Fabiana Mendes", "31621790258", "285021291", LocalDate.parse("20/11/1982", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "45987192", "antoniafabianamendes-90@ipek.net.br", new Endereco("13504114", "SP", "Rio Claro", "Vila Operária", "Rua 5", 618)));
        fisicaService.save(new Fisica("Gabrielly Adriana Isis Cardoso", "11909507237", "483379633", LocalDate.parse("15/05/1962", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "2136152836", "gabriellyadrianaisiscardoso@mega-vale.com", new Endereco("13506839", "SP", "Rio Claro", "Vila Paulista", "Avenida P 41", 928)));
        fisicaService.save(new Fisica("Sophia Vera Letícia Araújo", "80429800860", "303202786", LocalDate.parse("22/01/1946", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "8937972783", "sophiaveraleticiaaraujo@libbero.com.br", new Endereco("13500460", "SP", "Rio Claro", "Centro", "Avenida 12", 941)));
        fisicaService.save(new Fisica("Márcia Regina Cardoso", "86231636135", "139630144", LocalDate.parse("01/10/1942", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "7925092133", "marciareginacardoso@pronta.com.br", new Endereco("13503543", "SP", "Rio Claro", "Jardim Paulista", "Avenida 7", 588)));
        fisicaService.save(new Fisica("Tereza Silvana da Costa", "35040454775", "181534423", LocalDate.parse("27/06/1981", DateTimeFormatter.ofPattern("dd/MM/yyyy")), "7327642310", "terezasilvanadacosta@lphbrasil.com.br", new Endereco("13506755", "SP", "Rio Claro", "Vila Bela Vista", "Rua 18 A", 718)));

        //////////////////////////////////////////////////
        // Cliente - Jurídica
        //////////////////////////////////////////////////
        
        Juridica j1 = new Juridica("Caio e Josefa Construções", "Caio e Josefa Construções Ltda", "73597017000141", "191311032811", "1936412106", "desenvolvimento@caioejosefaconstrucoesltda.com.br", new Endereco("13506705", "SP", "Rio Claro", "Vila Indaiá", "Avenida 22 A", 466));
        Juridica j2 = new Juridica("Yago e Igor Corretores Associados", "Yago e Igor Corretores Associados ME", "89804245000185", "691364628202", "1925632653", "treinamento@yagoeigorcorretoresassociadosme.com.br", new Endereco("13500190", "SP", "Rio Claro", "Centro", "Rua 6", 328));
        Juridica j3 = new Juridica("Nicole e Valentina Advocacia", "Nicole e Valentina Advocacia Ltda", "38080138000110", "369282179216", "1935874867", "desenvolvimento@nicoleevalentinaadvocacialtda.com.br", new Endereco("13505164", "SP", "Rio Claro", "Jardim Santa Clara I", "Avenida M 33", 945));
        Juridica j4 = new Juridica("Ian e Felipe Lavanderia", "Ian e Felipe Lavanderia ME", "71581602000128", "127535537578", "1925964747", "faleconosco@ianefelipelavanderiame.com.br", new Endereco("13502326", "SP", "Rio Claro", "Jardim Nova Rio Claro", "Rua 28 NR", 872));
        Juridica j5 = new Juridica("Davi e Tomás Ferragens", "Davi e Tomás Ferragens ME", "25554611000102", "699424601636", "1937690283", "contabilidade@davietomasferragensme.com.br", new Endereco("13506280", "SP", "Rio Claro", "Residencial Florença", "Rua 11 RF", 161));

        juridicaService.save(j1);
        juridicaService.save(j2);
        juridicaService.save(j3);
        juridicaService.save(j4);
        juridicaService.save(j5);

        //////////////////////////////////////////////////
        // Pedido
        //////////////////////////////////////////////////
        
        Pedido p1 = new Pedido(LocalDateTime.now().minusDays(4), v1, f1, LocalDateTime.now().minusDays(3), LocalDateTime.now().minusDays(2), v1.getModelo().getCategoria().getDiaria());
        Pedido p2 = new Pedido(LocalDateTime.now().minusDays(2), v2, f2, LocalDateTime.now().minusDays(1), LocalDateTime.now(), v2.getModelo().getCategoria().getDiaria());
        Pedido p3 = new Pedido(LocalDateTime.now().minusDays(2), v3, f3, LocalDateTime.now().minusDays(1), LocalDateTime.now(), v3.getModelo().getCategoria().getDiaria());
        Pedido p4 = new Pedido(LocalDateTime.now().minusDays(2), v4, f4, LocalDateTime.now().minusDays(1), LocalDateTime.now(), v4.getModelo().getCategoria().getDiaria());
        Pedido p5 = new Pedido(LocalDateTime.now().minusDays(2), v5, f5, LocalDateTime.now().minusDays(1), LocalDateTime.now(), v5.getModelo().getCategoria().getDiaria());

        Fatura ft1 = p1.finalizar();
        Fatura ft2 = p2.finalizar();
        Fatura ft3 = p3.finalizar();
        Fatura ft4 = p4.finalizar();
        Fatura ft5 = p5.finalizar();

        pedidoService.save(p1);
        pedidoService.save(p2);
        pedidoService.save(p3);
        pedidoService.save(p4);
        pedidoService.save(p5);

        pedidoService.save(new Pedido(LocalDateTime.now().minusDays(1), v1, j1, LocalDateTime.now(), LocalDateTime.now().plusDays(1), v1.getModelo().getCategoria().getDiaria()));
        pedidoService.save(new Pedido(LocalDateTime.now().minusDays(1), v2, j2, LocalDateTime.now(), LocalDateTime.now().plusDays(1), v2.getModelo().getCategoria().getDiaria()));
        pedidoService.save(new Pedido(LocalDateTime.now().minusDays(1), v3, j3, LocalDateTime.now(), LocalDateTime.now().plusDays(1), v3.getModelo().getCategoria().getDiaria()));
        pedidoService.save(new Pedido(LocalDateTime.now().minusDays(1), v4, j4, LocalDateTime.now(), LocalDateTime.now().plusDays(1), v4.getModelo().getCategoria().getDiaria()));
        pedidoService.save(new Pedido(LocalDateTime.now().minusDays(1), v5, j5, LocalDateTime.now(), LocalDateTime.now().plusDays(1), v5.getModelo().getCategoria().getDiaria()));

        //////////////////////////////////////////////////
        // Fatura
        //////////////////////////////////////////////////
        
        faturaService.save(ft1);
        faturaService.save(ft2);
        faturaService.save(ft3);
        faturaService.save(ft4);
        faturaService.save(ft5);
    }

}
