package com.example.compshop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class HomeController {
  @GetMapping("/")
  public String home(Model model) {
    List<Product> products = List.of(
      new Product(1L, "Macintosh Plus", "A faster 8 MHz processor, 1 MB of RAM (expandable to 4 MB), a double-sided 800 KB floppy drive and a groundbreaking SCSI interface for external peripherals, including hard drives and printers.", 2599, "/images/Apple_Macintosh_Plus.png"),
      new Product(1L, "Apple Lisa", "A landmark personal computer known for being one of the first commercially available systems with a graphical user interface (GUI), featuring icons, windows, and a mouse for user interaction.", 9995, "/images/Apple_Lisa.png"),
      new Product(1L, "IBM PC", "A highly influential personal computer designed with an open architecture, featuring an Intel 8088 processor, five ISA expansion slots, and the ability to run MS-DOS.", 1565, "/images/IBM_PC.png"),
      new Product(1L, "Nec Multispeed", "This portable PC is a complete laptop machine, with LCD screen, battery and even 20MB hard disk. It is running with 10MHz Nec V30 CPU, compatible with 8086 but more powerful. It has 640kB of RAM in SRAM chips.", 1995, "/images/Nec_Multispeed.png"),
      new Product(1L, "Macintosh Plus", "A faster 8 MHz processor, 1 MB of RAM (expandable to 4 MB), a double-sided 800 KB floppy drive and a groundbreaking SCSI interface for external peripherals, including hard drives and printers.", 2599, "/images/Apple_Macintosh_Plus.png"),
      new Product(1L, "Apple Lisa", "A landmark personal computer known for being one of the first commercially available systems with a graphical user interface (GUI), featuring icons, windows, and a mouse for user interaction.", 9995, "/images/Apple_Lisa.png"),
      new Product(1L, "IBM PC", "A highly influential personal computer designed with an open architecture, featuring an Intel 8088 processor, five ISA expansion slots, and the ability to run MS-DOS.", 1565, "/images/IBM_PC.png"),
      new Product(1L, "Nec Multispeed", "This portable PC is a complete laptop machine, with LCD screen, battery and even 20MB hard disk. It is running with 10MHz Nec V30 CPU, compatible with 8086 but more powerful. It has 640kB of RAM in SRAM chips.", 1995, "/images/Nec_Multispeed.png"),
      new Product(1L, "Macintosh Plus", "A faster 8 MHz processor, 1 MB of RAM (expandable to 4 MB), a double-sided 800 KB floppy drive and a groundbreaking SCSI interface for external peripherals, including hard drives and printers.", 2599, "/images/Apple_Macintosh_Plus.png"),
      new Product(1L, "Apple Lisa", "A landmark personal computer known for being one of the first commercially available systems with a graphical user interface (GUI), featuring icons, windows, and a mouse for user interaction.", 9995, "/images/Apple_Lisa.png"),
      new Product(1L, "IBM PC", "A highly influential personal computer designed with an open architecture, featuring an Intel 8088 processor, five ISA expansion slots, and the ability to run MS-DOS.", 1565, "/images/IBM_PC.png"),
      new Product(1L, "Nec Multispeed", "This portable PC is a complete laptop machine, with LCD screen, battery and even 20MB hard disk. It is running with 10MHz Nec V30 CPU, compatible with 8086 but more powerful. It has 640kB of RAM in SRAM chips.", 1995, "/images/Nec_Multispeed.png"),
      new Product(1L, "Macintosh Plus", "A faster 8 MHz processor, 1 MB of RAM (expandable to 4 MB), a double-sided 800 KB floppy drive and a groundbreaking SCSI interface for external peripherals, including hard drives and printers.", 2599, "/images/Apple_Macintosh_Plus.png"),
      new Product(1L, "Apple Lisa", "A landmark personal computer known for being one of the first commercially available systems with a graphical user interface (GUI), featuring icons, windows, and a mouse for user interaction.", 9995, "/images/Apple_Lisa.png"),
      new Product(1L, "IBM PC", "A highly influential personal computer designed with an open architecture, featuring an Intel 8088 processor, five ISA expansion slots, and the ability to run MS-DOS.", 1565, "/images/IBM_PC.png"),
      new Product(1L, "Nec Multispeed", "This portable PC is a complete laptop machine, with LCD screen, battery and even 20MB hard disk. It is running with 10MHz Nec V30 CPU, compatible with 8086 but more powerful. It has 640kB of RAM in SRAM chips.", 1995, "/images/Nec_Multispeed.png")
    );

		model.addAttribute("products", products);
    return "home"; 
  }
}