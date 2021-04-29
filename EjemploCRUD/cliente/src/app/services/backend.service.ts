import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class BackendService {

  constructor(private http: HttpClient) { }

  URL: string = 'http://localhost:5000';

  getLibros(){
    return this.http.get(`${this.URL}/getlibros`) 
  }

  registrarLibro(libro:any){
    return this.http.post(`${this.URL}/registro`,libro)
  }

  /* 

  {
    "nombre":"El principito",
    "paginas":100
  }
  
  */

}
