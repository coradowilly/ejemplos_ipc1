import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent implements OnInit {

  csvContent: string;
    
    constructor(){}
    ngOnInit(){
    }

    onFileLoad(fileLoadedEvent) {
        const textFromFileLoaded = fileLoadedEvent.target.result;              
        this.csvContent = textFromFileLoaded;     
        console.log(this.csvContent)
        alert(this.csvContent);
    }

    onFileSelect(input: HTMLInputElement) {
    
      const files = input.files;
      var content = this.csvContent;    
      if (files && files.length) {
         /*
          console.log("Filename: " + files[0].name);
          console.log("Type: " + files[0].type);
          console.log("Size: " + files[0].size + " bytes");
          */
          
          const fileToRead = files[0];
          
          const fileReader = new FileReader();
          fileReader.onload = this.onFileLoad;

          fileReader.readAsText(fileToRead, "UTF-8");
      }
              
    }

}
