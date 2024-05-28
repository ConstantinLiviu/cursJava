public class Main {
    public static void main(String[] args) {
//        ---creati 1 tabela Bloc
//        ---creati 1 tabela Apartament
//        ---creati 4 endpoints CRUD pentru fiecare tabela.(cel putin 1 endpoint va avea @RequestParam)

//        @RestController
//@RequestMapping("/api/apartament")
//public class ApartamentController {
//
//    final ApartamentRepo apartamentRepo;
//
//    public ApartamentController(ApartamentRepo apartamentRepo) {
//        this.apartamentRepo = apartamentRepo;
//    }
//
//    @PostMapping("/add")
//    Apartament add(@RequestBody ApartamentDTOadd addDto) {
//        Apartament addAp = new Apartament();
//        addAp.setNumar(addDto.getNumar());
//        addAp.setEtaj(addDto.getEtaj());

//        https://start.spring.io/

//        ~~~ApartamentController~~~
//                ~~~BlocController~~~
//        @RestController
//        @RequestMapping("/api/bloc")
//        public class BlocController {
//
//            final BlocRepo blocRepo;
//
//            public BlocController(BlocRepo blocRepo) {
//                this.blocRepo = blocRepo;
//            }
//
//            @PostMapping("/add")
//            Bloc add(@RequestBody BlocDTOadd addDto) {
//                Bloc addBloc = new Bloc();
//                addBloc.setNumar(addDto.getNumar());
//                addBloc.setNume(addDto.getNume());
//                addBloc.setScara(addDto.getScara());
//                addBloc.setNumeStrada(addDto.getNumeStrada());
//                return blocRepo.save(addBloc);
//            }
//
//            @GetMapping("/blocuri")
//            public List<Bloc> getBlocuri() {
//                return blocRepo.findAll();
//            }
//
//            @GetMapping("/blocuri/{id}")
//            Bloc getById(@PathVariable Long id) {
//                return blocRepo.findById(id).get();
//            }
//        }
    }
}