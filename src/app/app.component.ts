import { Component, OnInit } from '@angular/core';
import { City } from './City';
import { Address } from './address';
import { EmployeeService } from './employee.service';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public city: City[];
  public address: Address[];
  

  constructor(private employeeService: EmployeeService){}

  ngOnInit() {
    this.getCity();
  }

  public getCity(): void {
    this.employeeService.getCities().subscribe(
      (response: Address[]) => {
        this.address = response;
        console.log(this.address);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  

  public searchCity(key: string): void {
    console.log(key);
    const results: City[] = [];
    for (const city of this.city) {
      if (city.name.toLowerCase().indexOf(key.toLowerCase()) !== -1
      ) {
        results.push(city);
      }
    }
    this.city = results;
    if (results.length === 0 || !key) {
      this.getCity();
    }
  }

  
  


}
