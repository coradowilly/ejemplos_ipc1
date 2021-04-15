import { Component, OnInit } from '@angular/core';
import { BackendService } from 'src/app/services/backend.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  libro:any = {
    nombre:'',
    paginas:0
  }

  constructor(private backend:BackendService) { }

  ngOnInit(): void {
  }

  registro(){
    console.log(this.libro)
    this.backend.registrarLibro(this.libro)
    .subscribe(
      res => {
        console.log(res)
      },
      err => {
        console.log(err)
      }
    )
  }

}
