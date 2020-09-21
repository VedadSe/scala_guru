package sedmica7

object Kviz {

  def main(args: Array[String]): Unit = {

    print("Dobrodosli u kviz MOZGALICA!")

    var setPitanja = Map(
      1 -> "Da li je covjek nastao od majmuna? (Da/Ne)",
      2 -> "Da li je Zemlja ravna ploca? (Da/Ne)",
      3 -> "Da li je islam jedina ispravna vjera? (Da/Ne)",
      4 -> "Da li je 1 kg vate tezi od 1 kg olova? (Da/Ne)",
      5 -> "Da li je FKS najveci klub u BiH? (Da/Ne)"
    )

    while (setPitanja.size > 0) {

      print("\nZamoljeni ste da unesete broj pitanja ->" + setPitanja.keys.mkString.replace("", " ") + ": ")

      var redniBrojPitanja: Int = scala.io.StdIn.readInt()

      setPitanja.get(redniBrojPitanja) match {
        case Some(sp: String) => println(redniBrojPitanja + s". ${sp}")

          print("\nOdgovor: ")
          var odgovor: String = scala.io.StdIn.readLine().toUpperCase

          if((redniBrojPitanja == 1 || redniBrojPitanja == 2 || redniBrojPitanja == 4) && odgovor == "NE") {
            print("\nOdgovor je tacan!")
            setPitanja = setPitanja.-(redniBrojPitanja)
          }
          else if((redniBrojPitanja == 3 || redniBrojPitanja == 5) && odgovor == "DA") {
            print("\nOdgovor je tacan!")
            setPitanja = setPitanja.-(redniBrojPitanja)
          }
          else {
            print("\nOdgovor je netacan! Upravo ste okoncali svoje ucesce u kvizu MOZGALICA!")
            sys.exit()
          }

        case _=> println("Unijeli ste nepostojeci broj pitanja! Pokusajte ponovo.")
      }

    }

    print("\nCestitamo! Uspjesno ste odgovorili na sva pitanja!")

  }

}
