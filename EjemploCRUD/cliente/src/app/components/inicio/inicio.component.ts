import { Component, OnInit } from '@angular/core';
import { BackendService } from 'src/app/services/backend.service';

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent implements OnInit {

  constructor(private backend:BackendService) { }

  libro:String

  ngOnInit(): void {
    this.backend.getLibros()
    .subscribe(
      res=>{
        console.log(res)
        let libtmp:any = res;

        this.libro = libtmp.message

      }
    )
  }

}
